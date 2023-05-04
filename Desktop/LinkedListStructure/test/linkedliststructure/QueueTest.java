/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package linkedliststructure;

import LinkedListStructure.Queue;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lahndrick Hendricks
 */
public class QueueTest {

    /**
     * Test of enqueue method and dequeue, of class Queue.
     */
    @Test
    public void testEnqueueAndDequeue() {
        String data = "test";
        String expResult = "test";
        Queue instance = new Queue();
        instance.enqueue(data);
        
        assertEquals(expResult,instance.dequeue());
    }

    /**
     * Test of getSize method, of class Queue.
     */
    @Test
    public void testGetSize() {
        Queue instance = new Queue();
        String test = "test";
        instance.enqueue(test);
        
        int expResult = 1;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

}
