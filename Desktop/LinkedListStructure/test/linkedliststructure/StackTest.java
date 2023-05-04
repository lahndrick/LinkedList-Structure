package linkedliststructure;

import LinkedListStructure.Stack;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lahndrick Hendricks
 */
public class StackTest {

    /**
     * Test of push method and pop method, of class Stack.
     */
    @Test
    public void testPush() {
        String data = "test";
        Stack instance = new Stack();
        instance.push(data);
        String expResult = "test";

        assertEquals(expResult, instance.pop());
    }

    /**
     * Test of getSize method, of class Stack.
     */
    @Test
    public void testGetSize() {
        Stack instance = new Stack();
        String test = "test";
        instance.push(test);
        
        int expResult = 1;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class Stack.
     */
    @Test
    public void testIsEmpty() {
        int count = 0;
        Stack instance = new Stack();
        String test = "test";
        
        instance.push(test);
        if(instance.getSize() == 1) count++;
        
        instance.pop();
        if(instance.getSize() == 0) count++;
        
        int expResult = 2;
        assertEquals(expResult, count);
    }

}
