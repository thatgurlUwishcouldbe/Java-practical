package reema;

public class Order {
    Item OrderItem;
    private final int orderNum;
    private static int nextNumber = 1;
    
    public Order(Item OrderItem) {
        this.OrderItem = OrderItem;
        this.orderNum = nextNumber;
        nextNumber++;
    }

    public Item getOrderItem() {
        return OrderItem;
    }

    public void setOrderItem(Item OrderItem) {
        this.OrderItem = OrderItem;
    }

    public int getOrderNum() {
        return orderNum;
    }
    
    public static int getNextNumber() {
        return nextNumber;
    }
    
    @Override
    public String toString(){
        return OrderItem.toString() + ",#" + orderNum ;
    }
}
