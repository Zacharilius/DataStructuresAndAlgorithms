package sorting;
/*
 * Implements the Bubble Sort algorithm 
 *
 * @author Zacharilius, @date 4/17/16 3:51 PM
 */
public class BubbleSort {
    public static void sortArray(String[] array) {
    	for (int i = 0; i < array.length; i++) {
    		for (int j = i + 1; j < array.length; j++) {
        		if (array[j - 1].compareTo(array[j]) > 0) {
        			String temp = array[j - 1];
        			array[j - 1] = array[j];
        			array[j] = temp;
        		}
    		}
    	}
    }
}
