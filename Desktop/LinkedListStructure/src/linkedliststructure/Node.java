package LinkedListStructure;

public class Node<E extends Comparable> {

    public E data;
    public Node next;

    public Node() {
        this.next = null;
        this.data = null;
    }

    public boolean equals(Node node) {
        if (this.data.equals(node.data)) {
            return true;
        }

        return false;
    }

    public int compareTo(Node node) {
        if (this.equals(node)) {
            return 0;
        } else {
            return this.data.compareTo(node.data);
        }
    }
}
