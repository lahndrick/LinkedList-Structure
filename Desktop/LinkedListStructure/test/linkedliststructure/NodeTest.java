package linkedliststructure;

import LinkedListStructure.Node;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lahndrick Hendricks
 */
public class NodeTest {

    /**
     * Test of equals method, of class Node.
     */
    @Test
    public void testEquals() {
        Node node = new Node();
        Node instance = new Node();
        
        node.data = "test";
        instance.data = "test";
        
        boolean result = instance.equals(node);
        assertTrue(result);
    }

    /**
     * Test of compareTo method, of class Node.
     */
    @Test
    public void testCompareTo() {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        int count = 0;
        
        node1.data = "1";
        node2.data = "2";
        node3.data = "3";
        
        Node instance = new Node();
        instance.data = "2";
        
        if(instance.compareTo(node1) > 0) count++;
        if(instance.compareTo(node2) == 0) count++;
        if(instance.compareTo(node3) < 0) count++;
        
        int expResult = 3;
        assertEquals(expResult, count);
    }
    
}
