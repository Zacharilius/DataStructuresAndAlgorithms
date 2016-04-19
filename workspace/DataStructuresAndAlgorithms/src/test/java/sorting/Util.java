package sorting;

/*
 * Creates arrays and provides helper utility functions to Sorting Tests
 */
public class Util {
	private static String[] array = {"Apple","Mango","Peach","Banana","Orange","Grapes","Watermelon","Tomato"};
	
	public static String[] getArray() {
		return array;
	}
	/*
	 * Returns true if an array is sorted. 
	 * 
	 */
	public static boolean isArraySorted(String[] array) {
		if (array.length <= 1) {
			return true;
		}
		
		String currentString = array[0];
		String nextString;
		for(int i = 1; i < array.length; i++) {
			nextString = array[i];
			if (currentString.compareTo(nextString) >= 0) {
				return false;
			}
			currentString = nextString;
		}
		return true;
	}
	
	public static String toString(String[] array) {
		StringBuilder builder = new StringBuilder();
		for(String s : array) {
		    builder.append(s + " ");
		}
		return builder.toString();
	}
}
