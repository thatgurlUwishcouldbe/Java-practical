public class Main {
    public static void main(String[] args) {
        
        course c1 = new course(111, "calac" , 4 , 5);
        course c2 = new course(222, "database" , 3 , 5);
        course c3 = new course(333, "java2" , 4 , 4);
        course cNOT = new course(000, "null" , 0 , 0);
        
        student s1 = new student("111", "reema",c1,4);
        student s2 = new student("222", "ola",c2);
        student s3 = new student("333", "hana",c3);
        
        System.out.println(test.FindByName(s1,c1));
        test.FindByID(s1,c1);
        test.FindByID(s3, cNOT);

////////////////////////////////////////////////////////////////////
        
        Scanner input = new Scanner(System.in);
        Farm farm = new Farm(10); 

        int choice;

        do {
            System.out.println("\n--- Farm Menu ---");
            System.out.println("1- Add agricultural crop");
            System.out.println("2- Sort by ID (Quick Sort)");
            System.out.println("3- Sort by Name (Bubble Sort)");
            System.out.println("4- Print all crops");
            System.out.println("5- Exit");
            System.out.print("Choose: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = input.next();

                    System.out.print("Enter ID: ");
                    int id = input.nextInt();

                    System.out.print("Enter kilos: ");
                    int kilos = input.nextInt();

                    System.out.print("Enter harvest days: ");
                    int days = input.nextInt();

                    AgriculturalCrop crop =
                            new AgriculturalCrop(name, id, kilos, days);

                    farm.addAgriculturalCrops(crop);
                    break;

                case 2:
                    farm.QuickSort(0, farm.count - 1);
                    System.out.println("Sorted by ID successfully.");
                    break;

                case 3:
                    farm.BubbleSort();
                    System.out.println("Sorted by Name successfully.");
                    break;

                case 4:
                    farm.printAllAgriculturalCrops();
                    break;

                case 5:
                    System.out.println("Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        input.close();
    }
}
/*
public class Main {

    public static void main(String[] args) {

        Farm farm = new Farm(10);

        AgriculturalCrop c1 = new AgriculturalCrop("Wheat", 3, 500, 30);
        AgriculturalCrop c2 = new AgriculturalCrop("Corn", 1, 200, 20);
        AgriculturalCrop c3 = new AgriculturalCrop("Rice", 2, 300, 25);

        farm.addAgriculturalCrops(c1);
        farm.addAgriculturalCrops(c2);
        farm.addAgriculturalCrops(c3);

        System.out.println("Before Sorting:");
        farm.printAllAgriculturalCrops();

        farm.QuickSort(0, farm.count - 1);

        System.out.println("\nAfter QuickSort (by ID):");
        farm.printAllAgriculturalCrops();

        farm.BubbleSort();

        System.out.println("\nAfter BubbleSort (by Name):");
        farm.printAllAgriculturalCrops();
    }
} 
*/
    }
}
