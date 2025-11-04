package LabVlll;

public class EmailTest
{
    public static void main(String[] args) {
        try {
            new Email(null, "b@b.com", "Hello");
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        try {
            new Email("a@a.com", "", "Hello");
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        try {
            new Email("a@a.com", "b@b.com", "  ");
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        
    }
}
