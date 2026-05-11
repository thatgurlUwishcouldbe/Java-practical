
package AirportSystem;

public class Bag {

    private String bagId;
    private double weight;

    public Bag(String bagId, double weight) {
        this.bagId = bagId;
        this.weight = weight;
    }

    public String getBagId() {
        return bagId;
    }

    public double getWeight() {
        return weight;
    }
}
