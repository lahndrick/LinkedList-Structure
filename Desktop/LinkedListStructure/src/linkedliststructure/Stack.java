package LinkedListStructure;

public class Stack<E extends Comparable> {

    private LinkedList<E> stack;

    public Stack() {
        this.stack = new LinkedList();
    }

    public void push(E data) {
        stack.addToHead(data);
    }

    public E pop() {
        return (E) stack.removeFromHead().data;
    }

    public void printStack() {
        stack.printLinkedList();
    }

    public int getSize() {
        return stack.size;
    }
    
    public boolean isEmpty(){
        return getSize() == 0;
    }
}
