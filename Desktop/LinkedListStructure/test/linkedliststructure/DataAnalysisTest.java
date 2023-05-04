package linkedliststructure;

import LinkedListStructure.DataAnalysis;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lahndrick Hendricks
 */
public class DataAnalysisTest {

    @Test
    public void testBracketEvaluator() {
        int count = 0;

        String trueString = "<<>>";
        String falseString = "<<>>>";

        char[] charList = trueString.toCharArray();
        Character[] testList = new Character[charList.length];

        DataAnalysis instance = new DataAnalysis(testList);

        for (int x = 0; x < testList.length; x++) {
            testList[x] = charList[x];
        }

        if (instance.bracketEvaluator() == true) {
            count++;
        }

        charList = falseString.toCharArray();
        testList = new Character[charList.length];

        for (int x = 0; x < testList.length; x++) {
            testList[x] = charList[x];
        }

        instance = new DataAnalysis(testList);
        if (instance.bracketEvaluator() == false) {
            count++;
        }

        assertEquals(2, count);
    }

}
