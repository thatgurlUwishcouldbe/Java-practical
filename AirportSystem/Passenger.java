
package AirportSystem;

class Passenger {

    private String name;
    private int  passportNumber;

    // Constructor
    public Passenger(String name, int passportNumber) {

        this.name = name;
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }
    
    @Override
    public String toString() {

        return  name + ", Passport: " + passportNumber;
    }
}
