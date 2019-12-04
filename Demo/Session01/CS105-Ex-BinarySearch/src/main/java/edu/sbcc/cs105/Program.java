package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) {

		int[] integerArray = createDataset();
		
		doSearch(integerArray, 23);		
		
			
	}

	private static int[] createDataset() {
		int[] integerArray = {1, 3, 4, 5, 9, 12, 17, 23, 24, 27, 33, 42, 45, 57, 63, 66, 70, 71, 79, 80, 81, 82, 93, 95, 98, 99};
		return integerArray;
	}
	
	public static void doSearch(int[] searchArray, int searchValue){
		
		int index = binarySearch(searchArray, searchValue);
		
		if (index == -1){
			System.out.printf("%d was not found in the list", searchValue);
		} else{
			System.out.printf("%d was found at index %d of the list", searchValue, index);
        }
        
	}
	
	 /**
     * Returns the index of the specified key in the specified array.
     *
     * @param  a the array of integers, must be sorted in ascending order
     * @param  key the search key
     * @return index of key in array <tt>a</tt> if present; <tt>-1</tt> otherwise
     */
    public static int binarySearch(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    

}
