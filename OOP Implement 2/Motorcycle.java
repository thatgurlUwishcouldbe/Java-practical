
package folder;

public class Motorcycle extends Vehicle{
    private int engineCapacity;
    
    public Motorcycle(int engineCapacity, String model, int yearOfManufac, String countryOfManufac) {
        super(model, yearOfManufac, countryOfManufac);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    
    @Override
    public String displayInfo(){
        return "Its a Model "+ getModel() +" Manufacture at " + getYearOfManufac()+ " in " + getCountryOfManufac();
    }
}
