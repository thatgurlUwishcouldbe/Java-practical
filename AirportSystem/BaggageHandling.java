package AirportSystem;

import java.util.*;

//Stack
public class BaggageHandling {

    Stack<Bag> bags = new Stack<>();

    public void scanBag(Bag B) {
        bags.push(B);
        System.out.println(B.getBagId() + "scanned");
    }

    public void scanBag(String bagId, double weight) {
        Bag bag = new Bag(bagId, weight);
        scanBag(bag);
    }

    public int getScanBagCount() {
        return bags.size();
    }

    public void removeBag(String ID) {

        Stack<Bag> temp = new Stack<>();
        boolean found = false;

        while (!bags.isEmpty()) {

            Bag b = bags.pop();

            if (b.getBagId().equals(ID)) {
                found = true;
                break;
            }

            temp.push(b);
        }

        while (temp.isEmpty()== false) {
            bags.push(temp.pop());
        }

        if (found) 
            System.out.println("Bag removed");
        System.out.println("Bag NOT found"); 
    }
    
    public void clearBaggageRecords(){
        bags.clear();
        
        //OR
        /*
        for (int i = 0; i < bags.size(); i++) {
            bags.pop();
        }
        OR
        while(bags.isEmpty()== false){
            queue.pop();
        }
        */
    }
}
