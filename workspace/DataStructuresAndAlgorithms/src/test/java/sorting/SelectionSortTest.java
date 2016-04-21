package sorting;
import org.junit.Test;

import sorting.BubbleSort;
import sorting.Util;

import static org.junit.Assert.*;

/*
 * Tests the SelectionSort class sorts an array.
 * @author Zacharilius
 */
public class SelectionSortTest {
    @Test public void testSelectionSort() {
    	String[] stringArray = Util.getArray();
        SelectionSort.sortArray(stringArray);
        assertTrue("Array should return sorted", Util.isArraySorted(stringArray));
    }
}
