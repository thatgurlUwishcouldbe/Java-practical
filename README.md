import java.util.Scanner;

public class training {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Ali", "Sara", "Mona", "Fahad", "Reema"};
        double[] salaries = new double[5];
        fillSalaries(salaries, input);
        analyzeSalaries(salaries);
        printNamesAndSalaries(names, salaries);
    }
    
    public static void fillSalaries(double[]x, double y){
        Scanner in = new Scanner(System.in);
        for(int  i = 0; i < x.length; i++){
            System.out.println("Enter number: " + (i+1) + "Salary: ");
            y = in.nextDouble();
            x[i] = y;
        }
        return;
    } 
    
    public static void analyzeSalaries(double[]x){
        double height = 0;
        double lowest = 0;
        for(int i = 0; i < x.length; i++){
            height = Math.max(height, x[i]);
        }
        lowest = height;
        for(int i = 0; i < x.length; i++){
            lowest = Math.min(lowest, x[i]);
        }
        int count = 0;
        for(int i = 0; i < x.length; i++){
            if(x[i] > 5000)
            count++;
        }
        System.out.printf("Highest salary: %f %nLowest Salary: %f %nNumber of Salary above 5000: %d",height,lowest,count);
    } 
    
    public static void printNamesAndSalaries(String[]x, double[]y){
        for( int i = 0; i < x.length; i++){
            System.out.println("Name: " + x[i] + "Salary: " + y[i]);
        }
    }
}
