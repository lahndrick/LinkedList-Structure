package LinkedListStructure;

public class Queue<E extends Comparable> {

    private LinkedList<E> queue;

    public Queue() {
        queue = new LinkedList();
    }

    public void enqueue(E data) {
        queue.add(data);
    }

    public E dequeue() {
        return (E) queue.removeFromHead().data;
    }

    public void printQueue() {
        queue.printLinkedList();
    }

    public int getSize() {
        return queue.size;
    }
}
