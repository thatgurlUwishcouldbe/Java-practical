import java.io.*;
import java.util.*;

public class PharmacySystem {

    public static void main(String[] args) {
        
        System.out.println("Welcome to Pharmacy System\nif you are Doctor select 1\nif you are Pharmacist select 2");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
       
        switch(choice){
            case 1:
                //PrescriptionQueue.addPrescription(Pp);
                break;
            case 2:
                PrescriptionQueue.poll();
                PrescriptionQueue.peek();
                PrescriptionQueue.numberOfUnpreparedPrescriptions();
                break;
                
            default:
                System.out.println("Invalid");
        }
        
        SinglyLinkedList<patient> patients = new SinglyLinkedList<>();
        
        try (Scanner scanner = new Scanner(new File("Patient.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                int age = Integer.parseInt(data[1]);
                String name = data[2];
                patient p = new patient(id, age, name);
                patients.addLast(p);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        /* OR
        patient p1 = new patient(0001, 43, "Mohamed");
        patient p2 = new patient(0002, 20, "Nora");
        patient p3 = new patient(0003, 56, "Amerah");
        patient p4 = new patient(0004, 20, "Sami");
        patient p5 = new patient(0005, 30, "Ahmad");
        patient p6 = new patient(0006, 11, "Hind");
        */




    }  
}
