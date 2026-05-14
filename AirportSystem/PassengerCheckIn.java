package AirportSystem;

import java.util.*;

//Queue
public class PassengerCheckIn {

    Queue<Passenger> line = new LinkedList<>();

    public void addPassenger(Passenger P) {
        line.add(P);//queue.enqueue(P);
        System.out.println(P.getName() + " added to the line.");
    }

    public void serveNextPassenger() {

        if (line.isEmpty()) {
            System.out.println("No passengers in line.");
            return;
        }

        System.out.println("Serving " + line.poll()); //line.dequeue()
    }

    public void peekNextPassenger() {

        if (line.isEmpty()) {
            System.out.println("No passengers in line.");
            return;
        }

        System.out.println("Next passenger " + line.peek()); //line.front()
    }

    public int getSize() {

        return line.size();
    }

    public void resetLine() {
        line.clear();

        //OR
        /*front = rear = null
        for (int i = 0; i < line.size(); i++) {
            line.poll(); //line.dequeue()
        }
        OR
        while(!line.isEmpty()){
            line.poll(); //line.dequeue()
        }
         */
    }
    
    // توقع
    public void serchPassenger(int Pnum){
        for(Passenger p : line){
            if((p.getPassportNumber()==  Pnum)){
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Passenger with " + Pnum + "NOT in line");
    }
    
    // add VIP Passenger توقع
    public void VIP(Passenger P){
        Stack<Passenger> temp = new Stack<>();
        
        while(!line.isEmpty()){
            temp.push(line.poll());
        }
        
        line.add(P);
        
        while(!temp.isEmpty()){
            line.add(temp.pop());
        }
    }
}
