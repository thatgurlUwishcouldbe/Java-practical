
package folder;

abstract class Vehicle {
    private String model;
    private int yearOfManufac;
    private String countryOfManufac;

    public Vehicle(String model, int yearOfManufac, String countryOfManufac) {
        this.model = model;
        this.yearOfManufac = yearOfManufac;
        this.countryOfManufac = countryOfManufac;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufac() {
        return yearOfManufac;
    }

    public void setYearOfManufac(int yearOfManufac) {
        this.yearOfManufac = yearOfManufac;
    }

    public String getCountryOfManufac() {
        return countryOfManufac;
    }

    public void setCountryOfManufac(String countryOfManufac) {
        this.countryOfManufac = countryOfManufac;
    }
    
    public String displayInfo(){
        return"";
    }
}
