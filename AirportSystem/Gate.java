
package AirportSystem;

public class Gate {
    private String letter;
    private int num;

    public Gate(String letter, int num) {
        this.letter = letter;
        this.num = num;
    }

    @Override
    public String toString() {
        return letter + num ;
    }  
}
