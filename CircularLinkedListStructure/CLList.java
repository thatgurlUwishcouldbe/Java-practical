public class CLList<E> {
	private Node<E> tail;
    private int size;

    // Constructor
    public CLList() {
        this.tail = null;
        this.size = 0;
    }

    
    // Get the number of elements in the list
    public int size() {
        return size;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Get the data of the first element in the list
    public E first() {
        if (isEmpty()) {
            return null;
        }
        return tail.next.data;
    }

    // Get the data of the last element in the list
    public E last() {
        if (isEmpty()) {
            return null;
        }
        return tail.data;
    }
    // Add an element to the beginning of the list
    public void addFirst(E data) {
        if(isEmpty()){
        tail = new Node<>(data,null);
        tail.next = tail; // Point to itself in a circular list
        } else {
            Node<E> newNode = new Node<>(data,tail.next);
            tail.next = newNode;
        }
        size++;
    }

    // Add an element to the end of the list
    public void addLast(E data) {
        addFirst(data);
        tail = tail.next;
    }

    // Remove the first element from the list
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Node<E> head = tail.next;
        if (head == tail) {
            tail = null;
        } else {
            tail.next = head.next;
        }
        size--;
        return head.data;
    }

    public void rotate() {
        if (isEmpty()) {
            return;
        }
        tail = tail.next; // Move the tail reference to the next node
    }

}
