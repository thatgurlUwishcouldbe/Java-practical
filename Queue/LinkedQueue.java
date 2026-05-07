
public class LinkedQueue<T> {
    private QNode<T> front;
    private QNode<T> rear;

    public LinkedQueue() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(T data) {
        QNode<T> newNode = new QNode<>(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public T dequeue() {
        if (isEmpty()) return null;

        T data = front.data;
        front = front.next;

        if (front == null) rear = null;

        return data;
    }
}
