package gna;

import java.util.Comparator;

/**
 * Performs sort by using the Selection Sort algorithm.
 * 
 * @author fill in your name here
 */
public class InsertionSort extends SortingAlgorithm {
	/**
	 * Sorts the given array using insertion sort.
	 * 
	 * @see super
	 */
	public long sort(Comparable[] array) throws IllegalArgumentException {
		if (array == null) {
			throw new IllegalArgumentException("argument 'array' must not be null.");
		}
        //code van washington.edu
        //http://courses.cs.washington.edu/courses/cse373/01wi/slides/Measurement/sld010.htm
		for (int i=1; i < array.length; i++){
            Comparable coTemp = array[i];
            int coJ;
            for (coJ = i - 1; coJ >= 0 && coTemp.compareTo(array[coJ]) < 0  ; coJ--) {
                array[coJ+1] = array[coJ];
            }
            array[coJ+1] = coTemp;
        }
        return 0;
	}

	/**
	 * Constructor.
	 */
	public InsertionSort() {
	}
}
