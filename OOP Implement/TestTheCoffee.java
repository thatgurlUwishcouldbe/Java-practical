package reema;

import java.util.Scanner;

public class TesttheCoffee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Item[] items = {
            new Item("Black Coffee", 5),
            new Item("Cappuccino", 10),
            new Item("Latte", 9),
            new Item("Espresso", 10),
            new Item("Iced Coffee", 10),
            new Item("Green Tea", 6)
        };

        CoffeeShop shop = new CoffeeShop("AI-Imam", "Riyadh", items);
        System.out.println(shop);
        int choice;

        do {
            System.out.println("\n=========================================");
            System.out.println("1. Display the Cheapest Item on the Menu");
            System.out.println("2. Display Coffee Shop Information");
            System.out.println("3. Add a New Order");
            System.out.println("4. Display Total Earnings Today");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: // Cheapest item
                    System.out.println("\nCheapest item: " + shop.cheapesItem() );
                    break;

                case 2: // Shop information (name, location, menu)
                    shop.shopInfo();
                    break;

                case 3: // Add order 
                    shop.addOrder();
                    break;

                case 4: // Total earnings
                    shop.totalPrices();
                    break;

                case 5: // Exit
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("\nInvalid input, try again!");
            }

        } while (choice != 5);

    }
}
