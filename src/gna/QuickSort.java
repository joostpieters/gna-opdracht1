package gna;

import java.util.Random;

/**
 * Performs sort by using the Selection Sort algorithm.
 *
 * @author Louis Roebben
 */
public class QuickSort extends SortingAlgorithm{
	/**
	 * Sorts the given array using quick sort.
	 * 
	 * @see super
	 */
    private static long lCounter = 0;
	public long sort(Comparable[] array) throws IllegalArgumentException {
		if (array == null) {
			throw new IllegalArgumentException("argument 'array' must not be null.");
		}
        lCounter = 0;
        shuffleArray(array);
        sort(array, 0, array.length - 1);

        return lCounter;
	}

    public static Comparable[] sort(Comparable[] array, int lo, int hi){
        if(hi <= lo) return array;
        int j = partition(array,lo,hi);
        array = sort(array, lo, j-1);
        array = sort(array, j+1, hi);

        return array;
    }

    private static int partition(Comparable[] array, int lo, int hi){
        int i = lo;
        int j = hi+1;
        Comparable v = array[lo];
        while (true){
            while (array[++i].compareTo(v) < 0) {
                lCounter++;
                if (i == hi) break;
            }
            lCounter++;
            while (v.compareTo(array[--j]) < 0){
                lCounter++;
                if (j == lo) break;
            }
            lCounter++;
            if(i >= j) break;{
                array = exch(array,i,j);
            }
        }
        array = exch(array,lo,j);
        return j;
    }

    // Implementing Fisher–Yates shuffle
    private static Comparable[] shuffleArray(Comparable[] ar)
    {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            ar = exch(ar,index,i);
        }
        return ar;
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
	public QuickSort() {
	}
}
