package AirportSystem;

import java.util.*;

//SinglyLinkedLis
public class LostAndFound {

    LinkedList<lostItem> items = new LinkedList<>();

    public void reportLostItem(lostItem item) {
        items.addLast(item);
        System.out.println("Item added.");
    }
    
    public void searchLostItem(String id) {

        for (lostItem item : items) {

            if (item.getItemId().equals(id)) {

                System.out.println(item);

                return;
            }
        }

        System.out.println("Item not found.");

    }

    /* OR
    public void searchLostItem(String id) {

        Node<lostItem> curr = items.getHead();

        while (curr != null) {
            if (current.getElement().getItemId().equals(id)) {
                System.out.println(current.getElement());

                return;
            }

            current = current.getNext();
        }

        System.out.println("Item not found.");
    }
     */
    
    //search by description توقع
    public void searchByDescription(String des){
        for (lostItem item : items) {

            if (item.getDescription().equals(des)) {

                System.out.println(item);

                return;
            }
        }

        System.out.println("Item not found.");
    }
    
    //توقع 
    public void claimItem(String id) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemId().equals(id)) { //OR items.moveToPos(i); items.getValue();
                if (items.get(i).getStatus().equals("Claimed")) {
                    System.out.println("Already claimed.");
                }
                items.get(i).setStatus("Claimed");

                return;
            }
        }

        System.out.println("NOT found");

    }

    /* OR
    public void claimItem(String id) {

        for (lostItem item : items) {

            if (item.getItemId().equals(id)) {

                if (item.getStatus().equals("Claimed")) {
                    System.out.println("Already claimed.");
                }

                item.setStatus("Claimed");

                System.out.println("Item claimed.");

                return;
            }
        }

        System.out.println("NOT found.");
    }
     */
    // توقع
    public void viewUnclaimedItems() {
        for (lostItem item : items) {
            if (item.getStatus().equals("Unclaimed")) 
                System.out.println(item);           
        }
        
        /* OR 
        SinglyLinkedList<lostItem> temp = new SinglyLinkedList<>();    
        
        for(int i = 0; i < items.size(); i++){
            if(item.getStatus().equals("Unclaimed"))
                temp.addLast(items.moveToPos(i).remove());
        }
        
        System.out.println(temp.print());
        */
    }
}
