package reema;
import java.util.Scanner;

public class CoffeeShop extends Shop {
    Scanner in = new Scanner(System.in); 
    private final Item[] menu;
    private Order[] toDayOrder;
 
    public CoffeeShop(String name, String location, Item[] menu){
        super(name, location);
        this.menu = menu;
        toDayOrder = new Order[5];
        }
    
    public void printMenu(){
        System.out.println("\n----- Menu -----");
        for(int i =0; i<5; i++){
            menu[i].toString();
        }
        System.out.println("-----------------");
    }
    
    public String cheapesItem(){
        Item cheapest = menu[0];
        for (int i = 0; i < menu.length; i++){
            if(menu[i].getPrice()<cheapest.getPrice())  
                cheapest =menu[i];
        }
        return cheapest.getName();
    }
   
    @Override
    public void shopInfo(){
        super.shopInfo();
        printMenu();
    }
    
    public void addOrder(){
        if (Order.getNextNumber() < this.toDayOrder.length){
                printMenu();
                System.out.println("Enter item name to order: ");
                String itemName = in.nextLine().trim();

            for (int i = 0; i < menu.length; i++) {
                if (menu[i].getName().equalsIgnoreCase(itemName)){ 
                    for (int j = 0; j < toDayOrder.length; j++){ 
                        if (toDayOrder[j] == null){
                            this.toDayOrder[j] = new Order(menu[i]);
                        }
                        else{ 
                            System.out.println("This item is currently unavailable!");
                        }
                    }
                }
                else{
                    System.out.println("Cannot add more orders. The order list is full.");
                }
            }    
        }      
    }

    public void totalPrices() {
        double earinings = 0.0;
        //applied for each loop
        for (Order order : toDayOrder) {
            if (order!= null) {
                earinings += order.getOrderItem().getPrice();
            }
        }
        System.out.println("\nTotal earnings today: " + earinings + " SR");
    }

}
