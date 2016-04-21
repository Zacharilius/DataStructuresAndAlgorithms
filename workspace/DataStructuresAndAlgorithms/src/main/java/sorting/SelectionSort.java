package sorting;
/*
 * Implements the Bubble Sort algorithm 
 *
 * @author Zacharilius
 */
public class SelectionSort {
    public static void sortArray(String[] array) {
    	for (int i = 0; i < array.length; i++) {
    		int lowestValueIndex = i;
    		for (int j = i + 1; j < array.length; j++) {
        		if (array[lowestValueIndex].compareTo(array[j]) > 0) {
        			lowestValueIndex = j;
        		}
    		}
    		String temp = array[i];
			array[i] = array[lowestValueIndex];
			array[lowestValueIndex] = temp;
    	}
    }
}
