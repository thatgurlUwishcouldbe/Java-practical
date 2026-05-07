
public class evaluition {

    public static void displayPrescriptionsByMedication(LinkedQueue<prescriptions> queue, String medName) {

        if (queue.isEmpty()) {
            System.out.println("No prescriptions found for this medication.");
            return;
        }

        LinkedQueue<prescriptions> temp = new LinkedQueue<>();
        boolean found = false;

        while (!queue.isEmpty()) {
            prescriptions p = queue.dequeue();

            if (p.getMedication().getName().equals(medName)) {
                System.out.println("(" + p.getPatient().getId() + ", "
                        + p.getMedication().getName() + ", "
                        + p.getMedication().getDose() + ", "
                        + p.getMedication().getAmount() + ", "
                        + p.getMedication().getDirections() + ")");
                found = true;
            }

            temp.enqueue(p);
        }

        while (!temp.isEmpty()) {
            queue.enqueue(temp.dequeue());
        }

        if (!found) {
            System.out.println("No prescriptions found for this medication.");
        }
    }

    public static void printQueue(LinkedQueue<prescriptions> queue) {

        if (queue.isEmpty()) {
            System.out.println("The queue is empty.");
            return;
        }

        LinkedQueue<prescriptions> temp = new LinkedQueue<>();

        while (!queue.isEmpty()) {
            prescriptions p = queue.dequeue();
            System.out.println("(" + p.getPatient().getId() + ", "
                    + p.getMedication().getName() + ", "
                    + p.getMedication().getDose() + ", "
                    + p.getMedication().getAmount() + ", "
                    + p.getMedication().getDirections() + ")");
            temp.enqueue(p);
        }

        while (!temp.isEmpty()) {
            queue.enqueue(temp.dequeue());
        }
    }

    public static void main(String[] args) {

        patient p1 = new patient(1,19, "Mohamed");
        patient p2 = new patient(2,21, "Nora");
        patient p3 = new patient(3,67, "Ahmad");

        Medication m1 = new Medication("Panadol", "500mg", 30, "After meal");
        Medication m2 = new Medication("Amoxicillin", "250mg", 20, "Twice daily");
        Medication m3 = new Medication("Brufen", "100mg", 10, "Before sleep");
        Medication m4 = new Medication("Panadol", "500mg", 15, "Before sleep");

        prescriptions pr1 = new prescriptions(p1, m1, "2025-10-29 09:00");
        prescriptions pr2 = new prescriptions(p2, m2, "2025-10-29 09:30");
        prescriptions pr3 = new prescriptions(p3, m3, "2025-10-29 10:00");
        prescriptions pr4 = new prescriptions(p1, m4, "2025-10-29 11:00");

        LinkedQueue<prescriptions> queue = new LinkedQueue<>();

        queue.enqueue(pr1);
        queue.enqueue(pr2);
        queue.enqueue(pr3);
        queue.enqueue(pr4);

        System.out.println("All prescriptions in queue:");
        printQueue(queue);

        System.out.println("\nPrescriptions for medication: Panadol");
        displayPrescriptionsByMedication(queue, "Panadol");
    }
}
