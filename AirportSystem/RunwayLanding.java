package AirportSystem;
// مراجعته مهمه

import java.util.*;
// note 1 normal 2 high 3 emergency
//PriorityQueue

public class RunwayLanding {

    AHeap<Integer, Flight> runway = new AHeap<>(100);
    // OR PriorityQueue<Flight> runway = new PriorityQueue<>((a, b) -> a.priority - b.priority);

    public void requestLanding(Flight F) {
        runway.insert(F.priority, F);
    }

    public void processNextLanding() {

        if (runway.isEmpty()) {
            System.out.println("No flights waiting");
            return;
        }

        AHNode<Integer, Flight> node = runway.removemax();
        System.out.println("Landing flight: " + node.getValue());

    }

    public Flight peekNextLanding() {
        if (runway.isEmpty()) {
            return null;
        }
        return runway.max().getValue();
    }

    public void viewLandingQueue() {

        if (runway.isEmpty()) {
            System.out.println("Empty queue.");
            return;
        }

        AHeap<Integer, Flight> temp = new AHeap<>(100);

        for (int i = 0; i < runway.size; i++) {
            temp.insert(runway.a[i].getKey(), runway.a[i].getValue());
        }

        while (!temp.isEmpty()) {
            AHNode<Integer, Flight> node = temp.removemax();
            System.out.println(node.getValue());
        }
    }

    public void changeLandingPriority(String code, int newP) {
        for (int i = 0; i < runway.size; i++) {

            // op AHNode<Integer, Flight> node = runway.a[i];
            if (runway.a[i].getValue().getFlightCode().equalsIgnoreCase(code)) {
                runway.a[i].setKey(newP);

                runway.upheap(i);
                runway.downheap(i);

                return;
            }
        }

        System.out.println("Flight NOT found.");
    }

    //Change Priority / Emergency Upgrade توقع
    public void EmergencyUpgrade(String code) {
        for (int i = 0; i < runway.size; i++) {
            if (runway.a[i].getValue().getFlightCode().equals(code)) {
                runway.a[i].getValue().priority = 3;

                runway.upheap(i);
                return;
            }
        }
        System.out.println("Flight NOT found.");
    }

    public void cancelLandingRequest(String code) {
        for (int i = 0; i < runway.size; i++) {
            if (runway.a[i].getValue().getFlightCode().equalsIgnoreCase(code)) {
                runway.a[i] = runway.a[runway.size() - 1];
                runway.size--;

                runway.downheap(i);
                runway.upheap(i);

                System.out.println("Cancelled");

                return;
            }
        }

        System.out.println("Flight NOT found.");
    }

    //توقعWrite a method to count how many flights exist for each priority level.
    public void countByLevel() {
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        for (int i = 0; i < runway.size; i++) {
            if (runway.a[i].getValue().priority == 1) {
                p1++;
            } else if (runway.a[i].getValue().priority == 2) {
                p2++;
            }
            p3++;
        }
        System.out.println("Priority 1: " + p1);
        System.out.println("Priority 2: " + p2);
        System.out.println("Priority 3: " + p3);
    }

    //توقع
    public void processEmergencyFlights() {
        int count = 0;

        if (runway.isEmpty()) {
            System.out.println("No flights waiting.");
            return;
        }

        AHeap<Integer, Flight> temp = new AHeap<>(100);
        for (int i = 0; i < runway.size; i++) {
            temp.insert(runway.a[i].getKey(), runway.a[i].getValue());
        }

        while (!temp.isEmpty()) {
            AHNode<Integer, Flight> node = temp.removemax();
            int riyadhCount = 0;

            if (node.getValue().priority == 3) {
                System.out.println(node.getValue());
                count++;
                if (node.getValue().getDestination().equalsIgnoreCase("Riyadh")) {
                    riyadhCount++;
                }
            }

            System.out.println("Emergency flights to Riyadh: " + riyadhCount);

        }

        double percentage = (count / runway.size) * 100.0;
        System.out.println("Emergency Percentage: " + percentage);

        System.out.println("Total emergency flights: " + count);
    }

    public void processMontrealFlight() {
        int count = 0;
        int Ecount = 0;
        if (runway.isEmpty()) {
            System.out.println("Empty");
            return;
        }

        for (int i = 0; i < runway.size; i++) {
            if (runway.a[i].getValue().getDestination().equalsIgnoreCase("Montreal") && runway.a[i].getValue().priority == 3) {
                System.out.println("Emergency Montreal Flight: " + runway.a[i].getValue());
                Ecount++;
                count++;
            } else if (runway.a[i].getValue().getDestination().equalsIgnoreCase("Montreal")) {
                System.out.println(runway.a[i].getValue());
                count++;
            }
        }

        double percentage = (count / runway.size) * 100.0;
        System.out.println("Montreal flight Percentage: " + percentage);

        System.out.println("Total emergency Montreal flights: " + Ecount);
        System.out.println("Total Montreal flights: " + count);
    }

    // توقع
    public void displayEmergencyFlights() {
        if (runway.isEmpty()) {
            System.out.println("Empty");
            return;
        }

        AHeap<Integer, Flight> temp = new AHeap<>(runway.size);

        for (int i = 0; i < runway.size; i++) {
            temp.insert(runway.a[i].getKey(), runway.a[i].getValue());
        }

        boolean result = false;

        while (!temp.isEmpty()) {
            AHNode<Integer, Flight> node = temp.removemax();

            if (node.getValue().priority == 3) {
                System.out.println(node);
            } else {
                result = true;
            }
        }

        if (result) {
            System.out.println("NO emergency flights.");
        }
    }
}
