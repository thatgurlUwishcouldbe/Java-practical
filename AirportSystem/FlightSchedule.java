package AirportSystem;
// مراجعته مهمه
import java.util.*;

import java.util.*;

//BST BC of displaySchedule() SORTED if ADT hes inorder
public class FlightSchedule {

    BST<String,Flight> flights = new BST<>();
    ArrayList<Flight> list = new ArrayList<>();// only to sort 

    public void addFlight(Flight F) {
        
        flights.insert(F.getFlightCode(), F);
        list.add(F);
        System.out.println("flight added");
    }

    // search by flight code
    public void searchFlight(String code) {

        Flight found = flights.find(code);

        if (found == null) {
            System.out.println("NOT Found.");
        }

        System.out.println("Found");

    }

    public void removeFlight(String code) {

        Flight removed = flights.remove(code);

        if (removed == null) {
            System.out.println("NOT Found.");
        } else {
            list.remove(removed);
        }
        System.out.println("Removed.");
    }

    public int getFlightCount() {
        return flights.size();
    }
    
    public void displaySchedule() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if(list.get(j).getFlightCode().compareTo(list.get(j + 1).getFlightCode()) > 0) {
                // swap
                Flight temp = list.get(j);

                list.set(j, list.get(j + 1));

                list.set(j + 1, temp);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //OR flights.inorderPrint();  
    }
}

//if the ADT BinaryTree

/*
import java.util.*;

public class FlightSchedule {

    BinaryTree<Flight> flights =
            new BinaryTree<>();

    // add root first
    public void addFlight(Flight f) {

        if(flights.getRoot() == null) {

            flights.addRoot(f);

            System.out.println("Flight added.");
        }

        else {

            insert(flights.getRoot(), f);

            System.out.println("Flight added.");
        }
    }

    // recursive insertion
    private void insert(TNode<Flight> root,
                        Flight f) {

        // smaller -> left
        if(f.getFlightCode().compareTo(
           root.getItem().getFlightCode()) < 0) {

            if(root.getLeft() == null) {

                flights.addLeft(root, f);
            }

            else {

                insert(root.getLeft(), f);
            }
        }

        // greater -> right
        else {

            if(root.getRight() == null) {

                flights.addRight(root, f);
            }

            else {

                insert(root.getRight(), f);
            }
        }
    }

    // search
    public void searchFlight(String code) {

        TNode<Flight> found =
                search(flights.getRoot(), code);

        if(found == null) {

            System.out.println("NOT Found.");
        }

        else {

            System.out.println(found.getItem());
        }
    }

    // recursive search
    private TNode<Flight> search(
            TNode<Flight> root,
            String code) {

        if(root == null) {

            return null;
        }

        if(root.getItem().getFlightCode()
                .equals(code)) {

            return root;
        }

        if(code.compareTo(
           root.getItem().getFlightCode()) < 0) {

            return search(root.getLeft(),
                    code);
        }

        else {

            return search(root.getRight(),
                    code);
        }
    }

    // remove
    public void removeFlight(String code) {

        TNode<Flight> found =
                search(flights.getRoot(), code);

        if(found == null) {

            System.out.println("NOT Found.");
        }

        else {

            flights.remove(found);

            System.out.println("Removed.");
        }
    }

    // count
    public int getFlightCount() {

        return flights.size(
                flights.getRoot());
    }

    // display sorted
    public void displaySchedule() {

        flights.inOrder(
                flights.getRoot());
    }
}
*/
