
package folder;

public class Car extends Vehicle{
    private int numOfSeats;

    public Car(int numOfSeats, String model, int yearOfManufac, String countryOfManufac) {
        super(model, yearOfManufac, countryOfManufac);
        this.numOfSeats = numOfSeats;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    } 
    
    @Override
    public String displayInfo(){
        return "Its a Car Model " + getModel() +" Manufacture at " + getYearOfManufac()+ " in " + getCountryOfManufac();
    }
}
