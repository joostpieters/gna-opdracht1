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
        //shuffleArray(array);
        sort(array, 0, array.length - 1);

        return lCounter;
	}

    public static void sort(Comparable[] array, int lo, int hi){
        if(hi <= lo) return;
        int j = partition(array,lo,hi);
        sort(array, lo, j-1);
        sort(array, j+1, hi);
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
            if(i >= j) break;

            exch(array,i,j);

        }
        exch(array,lo,j);
        return j;
    }

    // Implementing Fisher–Yates shuffle
    private static void shuffleArray(Comparable[] ar)
    {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            exch(ar,index,i);
        }
    }

    private static void exch(Comparable[] array, int i, int j){
        Comparable temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
	/**
	 * Constructor.
	 */
	public QuickSort() {
	}
}
