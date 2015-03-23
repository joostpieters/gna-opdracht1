package gna;

import libpract.SortingAlgorithm;
import org.junit.BeforeClass;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;
public class Main {
	/**
	 * Example main function.
	 * 
	 * You can replace this.
	 */
	public static void main(String[] args) {
            SortingAlgorithm quickSort = new QuickSort();
            SortingAlgorithm insertionSort = new InsertionSort();
            SortingAlgorithm selectionSort = new SelectionSort();
            Random random = new Random();

        System.out.println("quick sort test");
        for(int i = 1; i <= 100; i++) {
            Integer[] a = new Integer[i];
            for (int ii = 0; ii < i; ii++) {
                a[ii] = random.nextInt();
            }
            Comparable[] array = a.clone();
            System.out.println(i + "=" + quickSort.sort(array));
        }

        System.out.println("insertionsort test");
        for(int i = 1; i <= 100; i++) {
            Integer[] a = new Integer[i];
            for (int ii = 0; ii < i; ii++) {
                a[ii] = random.nextInt();
            }
            Comparable[] array = a.clone();
            System.out.println(i + "=" + insertionSort.sort(array));
        }

        System.out.println("selectionsort test");
        for(int i = 1; i <= 100; i++) {
            Integer[] a = new Integer[i];
            for (int ii = 0; ii < i; ii++) {
                a[ii] = random.nextInt();
            }
            Comparable[] array = a.clone();
            System.out.println(i + "=" + selectionSort.sort(array));
        }

        System.out.print("doubling ration experiment \n quicksort van 1000 getallen");
        System.out.print("we verwachten 13815 vergelijkingen");
        System.out.println("quick sort test");
        for(int y = 0; y <= 4; y++) {
            int i = 1000;
            Integer[] a = new Integer[i];
            for (int ii = 0; ii < i; ii++) {
                a[ii] = random.nextInt();
            }
            Comparable[] array = a.clone();
            System.out.println(i + "=" + quickSort.sort(array));
        }

	}
}
