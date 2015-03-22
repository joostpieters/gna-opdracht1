package gna;

/**
 * Performs sort by using the Selection Sort algorithm.
 * 
 * @author fill in your name here
 */
public class SelectionSort extends SortingAlgorithm {
	/**
	 * Sorts the given array using selection sort.
	 * 
	 * @see super
	 */
	public long sort(Comparable[] array) throws IllegalArgumentException {
		if (array == null) {
			throw new IllegalArgumentException("argument 'array' must not be null.");
		}
        long lCounter = 0;
		int N = array.length;
        for (int i = 0; i < N; i++){
            int min = i;
            for (int j = i+1; j < N; j++){
                lCounter++;
                if(array[j].compareTo(array[min]) < 0){
                    min = j;
                    exch(array,i,min);
                }
            }
        }

        return lCounter;
	}

    private static Comparable[] exch(Comparable[] array, int i, int j){
        Comparable temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return array;
    }
	/**
	 * Constructor.
	 */
	public SelectionSort() {
	}
}
