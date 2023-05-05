package LinkedListStructure;

public class LinkedList<E extends Comparable> {

    public int size;
    private Node head;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public Node getHead() {
        return head;
    }

    public void add(E data) {
        if (head == null) {
            head = new Node();
            head.data = data;
        } else {
            add(data, head);
        }

        size++;
    }

    private void add(E data, Node currentNode) {
        if (head == null) {
            head = new Node();
            head.data = data;
            return;
        }

        if (currentNode.next == null) {
            Node newNode = new Node();
            newNode.data = data;
            currentNode.next = newNode;
            return;
        }

        add(data, currentNode.next);
    }

    public void addToHead(E data) {
        Node newNode = new Node();
        newNode.data = data;

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    public void printLinkedList() {
        printLinkedList(head);
    }

    private void printLinkedList(Node current) {
        System.out.println(current.data);
        if (current.next != null) {
            printLinkedList(current.next);
        }
    }

    public boolean contains(Node node) {
        return contains(head, node);
    }

    private boolean contains(Node current, Node checkNode) {
        if (current == null) {
            return false;
        }

        if (current.equals(checkNode)) {
            return true;
        }

        current = current.next;
        return contains(current, checkNode);
    }

    public void remove(Node node) {
        if (head.equals(node)) {
            head = head.next;
        } else {
            remove(head, node);
        }

        size--;
    }

    private void remove(Node current, Node removeNode) {
        if (current == null) {
            return;
        }

        if (current.next.equals(removeNode)) {
            current.next = current.next.next;
            return;
        }

        current = current.next;
        remove(current, removeNode);
    }

    public Node removeFromHead() {

        if (head != null) {
            Node oldHead = head;

            head = head.next;
            size--;

            return oldHead;
        } else {
            return null;
        }

    }

    public Node removeFromTail() {
        if (head != null) {
            size--;
            return removeFromTail(head);
        }

        return null;
    }

    private Node removeFromTail(Node current) {
        if (current.next == null) {
            return current;
        }

        removeFromTail(current.next);

        current.next = null;

        return null;
    }

    public void addInOrder(E data) {
        head = addInOrder(data, head);
        size++;
    }

    private Node addInOrder(E data, Node node) {
        Node returnNode = new Node();

        if (node == null) {
            returnNode.data = data;
            return returnNode;
        }

        if (data.compareTo(node.data) < 0) {
            returnNode.data = data;
            returnNode.next = node;
            return returnNode;
        }

        node.next = addInOrder(data, node.next);
        return node;
    }

    public Node getNode(int index) {

        if (index == 0) {
            return head;
        }

        return getNode(head, index);
    }

    private Node getNode(Node current, int n) {
        if (n == 0 || current.next == null) {
            return current;
        } else {
            current = current.next;
            n--;
        }

        return getNode(current, n);
    }

    public E getData(int index) {
        Node node = getNode(index);

        return (E) node.data;
    }

    public void addNode(Node node) {
        add((E) node.data);
    }

    public Node getTail() {
        return getTail(head);
    }

    public Node getTail(Node current) {
        if (current.next == null) {
            return current;
        } else {
            getTail(current.next);
        }
        return null;
    }
}
