package AirportSystem;
// مراجعته مهمه

import java.util.*;

//HashMap لان نبي سررررعععه
public class GateManagement {

    Hashtable gates = new Hashtable(10);

    // Normally linear Probing
    public void assignGate(int num) {
        for (int i = 0; i < 10; i++) {

            int  p = Hashtable.linearProbing(1, 0, 10, num, i);

            if (gates.put(num, p)) {

                System.out.println("Gate assigned.");

                return;
            }
        }

        System.out.println("Table is full.");
    }

    public void findGate(int num) {
        int p;
        for (int i = 0; i < 10; i++) {

            p = Hashtable.linearProbing(1, 0, 10, num, i);

            if (gates.emptySlot(p)) {
                break;
            }
            if (gates.put(num, p)) {
                System.out.println("Gate found.");
            } else {
                return;
            }
        }

        System.out.println("NOT found.");
    }

    public void removeGateAssignment(int num) {
        int p;
        for (int i = 0; i < 10; i++) {

            p = Hashtable.linearProbing(1, 0, 10, num, i);

            if (gates.emptySlot(p)) {
                break;
            }

            if (gates.remove(num, p)) {
                System.out.println("Removed.");
                return;
            }

        }

        System.out.println("Gate not found.");
    }
    
    public void displayAllGateAssignments(){
        gates.print();
    } 
    
    //توقع بدون الميثودات انا اكتبهم
    public void updateGate(int oldNum, int newNum){
        removeGateAssignment(oldNum);
        assignGate(newNum);
    }
    
    public void assignGateWithQuadratic(int num){
        for (int i = 0; i < 10; i++) { 
            
            int p = Hashtable.quadraticProbing(0, 1, 10, num, i);
            
            if(gates.put(num, p)){
                System.out.println("Gate assigned.");
                return;
            }
            
            System.out.println("Table full.");
        }
    }
}
