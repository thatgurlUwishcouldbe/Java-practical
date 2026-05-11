package AirportSystem;
// مراجعته مهمه
import java.util.*;

//HashMap لان نبي سررررعععه
public class GateManagement {

    //code,Gate num
    HashMap<String, Gate> gates = new HashMap<>();

    public void assignGate(String code, Gate gateNumber) {
        gates.put(code, gateNumber);

    }

    public void findGate(String code) {
        if (gates.get(code) != null) {
            System.out.println("Gate: " + gates.get(code));
        }
        System.out.println("NOT Found.");
    }

    public void removeGateAssignment(String code) {
        if (gates.remove(code) != null) {
            System.out.println("Assignment removed.");
        }
    }
    
    public void displayAllGateAssignments(){
        //for each اسهل لوب وافضل لوب
        for (String code : gates.keySet()) {
            System.out.println(code + "->" + gates.get(code));  
        }
    }  
}
