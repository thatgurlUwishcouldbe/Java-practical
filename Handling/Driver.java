package LabVlll;

public class Driver {
    public static void main(String[] args) {
        Email email = new Email("a@a.com", "b@b.com", "Hello");
        
        try{
            email.attach(null);
            email.attach(new Attachment("file.pdf",12.0));
        }
        catch(IllegalArgumentException | EAE e){
            e.getMessage();
        }
        finally{
            System.out.println("Finally");
        }
    }
    
}
