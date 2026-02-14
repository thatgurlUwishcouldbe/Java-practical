package lab1;

import java.util.Scanner;
import java.io.File.*;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        HospitalSystem hs = new HospitalSystem("doctors.txt");

        int choice;

        do {
            System.out.println("\n===== Hospital System =====");
            System.out.println("1) Add Patient");
            System.out.println("2) Assign Patient to Doctor");
            System.out.println("3) Search Patient by ID");
            System.out.println("4) Remove Patient by ID");
            System.out.println("5) Count Patients Older Than");
            System.out.println("6) Print Last Two Patients");
            System.out.println("0) Exit");
            System.out.print("Choose: ");

            choice = in.nextInt();
            in.nextLine();

            switch (choice) {

                case 1: {
                    System.out.print("Enter Patient ID: ");
                    String id = in.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String name = in.nextLine();

                    System.out.print("Enter Patient Age: ");
                    int age = in.nextInt();
                    in.nextLine();

                    System.out.print("Enter Clinic Name: ");
                    String clinic = in.nextLine();

                    Patient p = new Patient(id, age, name,clinic);
                    hs.addPatient(p);

                    System.out.println("Patient added successfully!");
                    break;
                }

                case 2: {
                    hs.assignPatientToDoc();
                    break;
                }

                case 3: {
                    System.out.print("Enter Patient ID to search: ");
                    String id = in.nextLine();

                    Patient p = hs.searchPatientByID(id);

                    if (p != null) {
                        System.out.println("\nPatient Found:");
                        System.out.println(p);
                    } else {
                        System.out.println("Patient not found!");
                    }
                    break;
                }

                case 4: {
                    System.out.print("Enter Patient ID to remove: ");
                    String id = in.nextLine();

                    hs.removePatienbuID(id);
                    System.out.println("If patient existed, it was removed.");
                    break;
                }

                case 5: {
                    System.out.print("Enter age: ");
                    int age = in.nextInt();
                    in.nextLine();

                    int count = hs.countPatientsOlderThan(age);
                    System.out.println("Number of patients older than " + age + ": " + count);
                    break;
                }

                case 6: {
                    hs.printLastTwo();
                    break;
                }

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        in.close();
    }
}
