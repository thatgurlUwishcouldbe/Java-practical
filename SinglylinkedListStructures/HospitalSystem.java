package lab1;

public class HospitalSystem {

    private SinglyLinkedList<Doctor> Doc = new SinglyLinkedList<>();
    private SinglyLinkedList<Patient> waitingList = new SinglyLinkedList<>();

    public HospitalSystem(String DocFilepathe) {
        
    }

    public int countPatientsOlderThan(int age) {
        waitingList.moveToStart();
        int count = 0;
        int i = 0;
        while (i < waitingList.size()) {
            if (age < waitingList.getValue().age) {
                count++;
            }
            waitingList.moveToPos(i++);
        }
        return count;
    }

    public void addPatient(Patient P) {
        waitingList.addLast(P);
    }

    public void assignPatientToDoc() {
        waitingList.moveToStart();
        int i = 0;
        while (i < Doc.size()) {
            if (waitingList.first().clinic.equals(Doc.getValue().clinic)) {
                System.out.println("Done assigning");
                waitingList.removeFirst();
                return;
            } else {
                Doc.moveToPos(i++);
            }
        }
    }

    public Patient searchPatientByID(String ID) {
        waitingList.moveToStart();
        for (int i = 0; i < waitingList.size(); i++) {
            if (ID.equals(waitingList.getValue().getId())) {
                return waitingList.getValue();
            }
        }
        return null;
    }

    public void removePatienbuID(String ID) {
        waitingList.moveToStart();
        int i = 0;
        while (i < waitingList.size()) {
            if (ID.equals(waitingList.getValue().getId())) {
                waitingList.remove(i);
                return;
            }
            waitingList.moveToPos(i++);
        }
    }

    public void printLastTwo() {
        waitingList.moveToPos(waitingList.size() - 2);
        System.out.println(waitingList.getValue());
        waitingList.moveToPos(waitingList.size() - 1);
        System.out.println(waitingList.getValue());
    }
}
