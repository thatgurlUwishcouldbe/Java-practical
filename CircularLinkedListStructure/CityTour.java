
import java.util.*;

public class CityTour {

    public static CLList<Landmark> list = new CLList<Landmark>();

    public static void Remove_Landmark(String LandmarkName) {
        if (list.isEmpty()) {
            System.out.println("Empty");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.last().equals(LandmarkName)) {
                list.removeFirst();
                System.out.println("Successfully removed");
                return;
            }
            list.rotate();
        }
    }

    public static void Print_Tour_Route() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.last().getLandmarkName());
            list.rotate();
        }

    }

    public static void Search_For_Landmark(String LandmarkName) {
        if (list.isEmpty()) {
            System.out.println("Empty");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.last().equals(LandmarkName)) {
                System.out.println("Found");
                return;
            }
            list.rotate();
        }
        System.out.println("NOTFound");
    }
    
    public static void Tour_Duration(){
        int result=0;
        for (int i = 0; i < list.size(); i++) {
            result += list.last().getScheduledTime();
        }
        
        System.out.println("The duratino in hours: " + (result/60) + " Hour = " + result + " minutes");  
    }

    public static void main(String[] args) throws Exception {
        //public static CLList<Landmark> CityTourLIst = new CLList<Landmark>();
        
        Scanner input = new Scanner(System.in);
        int choice;
        
        Landmark L1 = new Landmark("Eiffel Tower",80);
        Landmark L2 = new Landmark("Siene River",60);
        Landmark L3 = new Landmark("Arc de Triompho",40);
        Landmark L4 = new Landmark("Louver Musem",60);
        
        list.addLast(L1);
        list.addLast(L2);
        list.addLast(L3);
        list.addLast(L4);
        
        System.out.println("Welcome to the City Tour Management System. Choose your option from the following menu:\n");
        System.out.println(" 1- Print Tour Route \n 2- Search For a Landmark \n");
        boolean done = false;
        String name;
        do {
            choice = input.nextInt();
            input.nextLine(); // ignore next line after int

            switch (choice) {
                case 1:
                    Print_Tour_Route();
                    break;

                case 2:
                    System.out.println("Enter the Landmark name:");
                    name = input.nextLine();
                    Search_For_Landmark(name);
                    break;

                case 3:
                    done = true;
            }
        } while (!done);

    }
}
