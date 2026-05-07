
import java.util.Date;
// كلاس الوصفة الطبيه
public class prescriptions {
    
    private patient p;
    private Medication m;
    private String date;

    public prescriptions(patient p, Medication m, String date) {
        this.p = p;
        this.m = m;
        this.date = date;
    }

    public patient getPatient() {
        return p;
    }

    public Medication getMedication() {
        return m;
    }

    public String getDate() {
        return date;
    }
 
    int P_ID;
    Medication P_Medication ;
    

    public prescriptions ( int P_id,Medication P_Medication ){

        this.P_ID=P_id;
        this.P_Medication= P_Medication;
        
    }

   
   public void print () {
       System.out.println(" \n The medcation is");
        System.out.println (P_Medication);
       
   }

}
