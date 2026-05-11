package AirportSystem;
// مراجعته مهمه
import java.util.*;

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
        }

        AHNode<Integer, Flight> node = runway.removemax();
        System.out.println("Landing flight: " + node.getValue().getFlightCode());
    }

    public Flight peekNextLanding() {
        if (runway.isEmpty()) {
            return null;
        }
        return runway.max().getValue();
    }

    public void viewLandingQueue() {
        if (runway.isEmpty() != true) {
            runway.print();
        }
        System.out.println("Empty queue.");
    }

    public void changeLandingPriority(String code, int newP) {
        for (int i = 0; i <= runway.size(); i++) {

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

    public void cancelLandingRequest(String code) {
        for (int i = 0; i <= runway.size(); i++) {
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
}
