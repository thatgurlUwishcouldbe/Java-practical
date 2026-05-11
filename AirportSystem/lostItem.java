package AirportSystem;

public class lostItem {
    
    private String itemID;
    private String description;
    private String status;

    public lostItem(String itemId, String description) {

        this.itemID = itemId;
        this.description = description;
        status = "Unclaimed";
    }

    public String getItemId() {
        return itemID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {

        return itemID + " - "
                + description + " - "
                + status;
    }
}
