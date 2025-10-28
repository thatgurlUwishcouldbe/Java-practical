
package folder;

public class Garage {
    private Vehicle[] garage;

    public Garage(int num) {
        this.garage = new Vehicle[num];
        }

    public void setGarage(Vehicle[] garage) {
        this.garage = garage;
    }

    public void addToGarage(Vehicle obj){
        for (int i = 0; i < garage.length; i++) {
            if(garage[i].equals(null)) {
                garage[i] = obj;
                break;
            }
        } 
    }
    
    public void deleteFromGarage(Vehicle obj){
        for (int i = 0; i < garage.length; i++) {
            if(garage[i].equals(obj)) {
                garage[i] = null;
                break;
            }
        } 
    }

    public void addToGarage(Vehicle obj,String model){
        for (int i = 0; i < garage.length; i++) {
            if(garage[i].equals(null) && garage[i].getModel().equalsIgnoreCase(model)) {
                garage[i] = obj;
                break;
            }
        } 
    }
    
    public void deleteFromGarage(String model){
        for (int i = 0; i < garage.length; i++) {
            if(garage[i]!=null && garage[i].getModel().equalsIgnoreCase(model)) {
                garage[i] = null;
                break;
            }
        } 
    }
    
    public void addToGarage(Vehicle obj,int year){
        for (int i = 0; i < garage.length; i++) {
            if(garage[i].equals(null) && garage[i].getYearOfManufac()==year) {
                garage[i] = obj;
                break;
            }
        } 
    }
    
    public void deleteFromGarage(int year){
        for (int i = 0; i < garage.length; i++) {
            if(garage[i]!=null &&garage[i].getYearOfManufac()==year) {
                garage[i] = null;
                break;
            }
        } 
    }
    
    public void addToGarage(String country ,Vehicle obj){
        for (int i = 0; i < garage.length; i++) {
            if(garage[i].equals(null) && garage[i].getCountryOfManufac().equalsIgnoreCase(country)) {
                garage[i] = obj;
                break;
            }
        } 
    }
    
    public void deleteFromGarage(String country ,Vehicle obj){
        for (int i = 0; i < garage.length; i++) {
            if(garage[i].equals(obj) && garage[i].getCountryOfManufac().equalsIgnoreCase(country)) {
                garage[i] = null;
                break;
            }
        } 
    }
    
    public void printGarageContents(){
        System.out.println("The contents in the garage: ");
        for(Vehicle i : garage){
            if(i!=null)
            System.out.println(i);
        } 
    } 
}
