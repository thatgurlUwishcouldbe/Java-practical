
package folder;

public class Truck extends Vehicle{
    private int loadCapacity;

    public Truck(int loadCapacity, String model, int yearOfManufac, String countryOfManufac) {
        super(model, yearOfManufac, countryOfManufac);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    
    @Override
    public String displayInfo(){
        return "Its a Truck Model "+ getModel() +" Manufacture at " + getYearOfManufac()+ " in " + getCountryOfManufac();
    }
}
