
public class PrescriptionQueue {
    
    static SinglyLinkedList<prescriptions> Queue = new SinglyLinkedList<prescriptions>();
    
    public static void addPrescription(prescriptions e){
        Queue.addLast(e);
    }
    
    public static prescriptions poll(){
        return Queue.removeFirst();
    }
    
    public static prescriptions peek(){
        return Queue.first();
    }
    
    static public int numberOfUnpreparedPrescriptions(){
        return Queue.size();
    }

}
