package sorting;
import org.junit.Test;

import sorting.BubbleSort;
import sorting.Util;

import static org.junit.Assert.*;

/*
 * Tests the BubbleSort class sorts an array.
 * @author Zacharilius
 */
public class BubbleSortTest {
    @Test public void testBubbleSort() {
    	String[] stringArray = Util.getArray();        
        BubbleSort.sortArray(stringArray);
        assertTrue("Array should return sorted", Util.isArraySorted(stringArray));
    }
}
