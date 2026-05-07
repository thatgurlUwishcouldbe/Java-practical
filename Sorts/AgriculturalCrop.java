
public class AgriculturalCrop {
    private String name;
    private int id;
    private int kilos;
    private int hervestday;

    public AgriculturalCrop(String name, int id, int kilos, int hervestday) {
        this.name = name;
        this.id = id;
        this.kilos = kilos;
        this.hervestday = hervestday;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getKilos() {
        return kilos;
    }

    public int getHervestday() {
        return hervestday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    public void setHervestday(int hervestday) {
        this.hervestday = hervestday;
    }

    @Override
    public String toString() {
        return  name + "it ID is" + id + ", kilos: " + kilos + ", hervestday: " + hervestday;
    }
    
}
