package gna;

import static org.junit.Assert.*;
import libpract.SortingAlgorithm;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

/**
 * Tests that test whether the implementations of the sorting algorithms do sort.
 */
public class SortingAlgorithmsTest {
    static SortingAlgorithm quickSort;
    static SortingAlgorithm insertionSort;
    static SortingAlgorithm selectionSort;

    @BeforeClass
    public static void beforeClass(){
        quickSort = new QuickSort();
        insertionSort = new InsertionSort();
        selectionSort = new SelectionSort();
    }

    /*
    test
     */
    @Test
    public void testSelectionSort(){
        Integer[] a = {1,10,100,1000,10000,100000,1000000,10000000,0};
        Comparable[] array = a.clone();
        Comparable[] coCorrect = a;
        Arrays.sort(coCorrect);
        selectionSort.sort(array);
        assertArrayEquals(array,coCorrect);
    }

    @Test
    public void testInsertionSort(){
        Integer[] a = {1,10,100,1000,10000,100000,1000000,10000000,0};
        Comparable[] array = a.clone();
        Comparable[] coCorrect = a;
        Arrays.sort(coCorrect);
        insertionSort.sort(array);
        assertArrayEquals(array,coCorrect);
    }
    @Test
    public void testQuickSort(){
        Integer[] a = {1,10,100,1000,10000,100000,1000000,10000000,0};
        Comparable[] array = a.clone();
        Comparable[] coCorrect = a;
        Arrays.sort(coCorrect);
        quickSort.sort(array);
        assertArrayEquals(array,coCorrect);
    }


}
