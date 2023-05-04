package linkedliststructure;

import LinkedListStructure.LinkedList;
import LinkedListStructure.Node;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lahndrick Hendricks
 */
public class LinkedListTest {

    /**
     * Test of add method, of class LinkedList.
     */
    @Test
    public void testAdd() {
        String data = "test";
        LinkedList instance = new LinkedList();
        instance.add(data);

        assertEquals(1, instance.size);
    }

    /**
     * Test of contains method, of class LinkedList.
     */
    @Test
    public void testContains() {
        Node test = new Node();
        test.data = "test";

        LinkedList instance = new LinkedList();
        instance.addNode(test);

        assertTrue(instance.contains(test));
    }

    /**
     * Test of remove method, of class LinkedList.
     */
    @Test
    public void testRemove() {
        Node test1 = new Node();
        test1.data = "test1";
        Node test2 = new Node();
        test2.data = "test2";
        Node test3 = new Node();
        test3.data = "test3";

        LinkedList instance = new LinkedList();
        instance.addNode(test1);
        instance.addNode(test2);
        instance.addNode(test3);

        instance.remove(test2);

        assertTrue(!(instance.contains(test2)) && instance.size == 2);
    }

    /**
     * Test of removeFromHead method, of class LinkedList.
     */
    @Test
    public void testRemoveFromHead() {
        LinkedList instance = new LinkedList();
        Node test1 = new Node();
        test1.data = "test1";
        Node test2 = new Node();
        test2.data = "test2";
        Node test3 = new Node();
        test3.data = "test3";

        instance.addNode(test1);
        instance.addNode(test2);
        instance.addNode(test3);

        Node expResult = test1;
        Node result = instance.removeFromHead();

        assertTrue(expResult.equals(result));
    }

    /**
     * Test of removeFromTail method, of class LinkedList.
     */
    @Test
    public void testRemoveFromTail() {
        LinkedList instance = new LinkedList();
        Node test1 = new Node();
        test1.data = "test1";
        Node test2 = new Node();
        test2.data = "test2";
        Node test3 = new Node();
        test3.data = "test3";

        instance.addNode(test1);
        instance.addNode(test2);
        instance.addNode(test3);

        instance.removeFromTail();

        Boolean result = instance.contains(test3);
        Boolean expResult = false;

        assertEquals(expResult, result);
    }

    /**
     * Test of addInOrder method, of class LinkedList.
     */
    @Test
    public void testAddInOrder() {
        int count = 0;
        LinkedList instance = new LinkedList();
        instance.addInOrder("BAA");
        instance.addInOrder("ABA");
        instance.addInOrder("AAB");
        instance.addInOrder("ABB");
        instance.addInOrder("BBB");

        if (instance.getNode(0).data.equals("AAB")) {
            count++;
        }
        if (instance.getNode(1).data.equals("ABA")) {
            count++;
        }
        if (instance.getNode(2).data.equals("ABB")) {
            count++;
        }
        if (instance.getNode(3).data.equals("BAA")) {
            count++;
        }
        if (instance.getNode(4).data.equals("BBB")) {
            count++;
        }

        int expResult = 5;

        assertEquals(expResult, count);
    }

    /**
     * Test of getData method, of class LinkedList.
     */
    @Test
    public void testGetData() {
        int index = 0;
        LinkedList instance = new LinkedList();
        instance.add("test");

        Object expResult = "test";
        Object result = instance.getData(index);

        assertEquals(expResult, result);
    }

    /**
     * Test of getTail method, of class LinkedList.
     */
    @Test
    public void testGetTail_0args() {
        LinkedList instance = new LinkedList();
        Node test1 = new Node();
        test1.data = "test1";
        Node test2 = new Node();
        test2.data = "test2";
        Node test3 = new Node();
        test3.data = "test3";

        instance.addNode(test1);
        instance.addNode(test2);
        instance.addNode(test3);

        assertTrue(instance.getNode(instance.size-1).equals(test3));
    }
}
