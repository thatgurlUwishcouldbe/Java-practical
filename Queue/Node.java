
public class Node<E> {
	public E data;
    public Node<E> next;


    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;

    }

    public E getElement() {
        return data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setElement(E data) {
        this.data = data;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

}
