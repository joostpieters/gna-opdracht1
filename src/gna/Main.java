package gna;

import libpract.SortingAlgorithm;
import org.apache.commons.lang3.time.StopWatch;

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
            StopWatch oWatch = new StopWatch();

        System.out.println("quick sort test");
        for(int i = 1; i <= 100; i++) {
            Integer[] a = new Integer[i];
            for (int ii = 0; ii < i; ii++) {
                a[ii] = random.nextInt();
            }
            Comparable[] array = a.clone();
            System.out.println(quickSort.sort(array));
        }

        System.out.println("insertionsort test");
        for(int i = 1; i <= 100; i++) {
            Integer[] a = new Integer[i];
            for (int ii = 0; ii < i; ii++) {
                a[ii] = random.nextInt();
            }
            Comparable[] array = a.clone();
            System.out.println(insertionSort.sort(array));
        }

        System.out.println("selectionsort test");
        for(int i = 1; i <= 100; i++) {
            Integer[] a = new Integer[i];
            for (int ii = 0; ii < i; ii++) {
                a[ii] = random.nextInt();
            }
            Comparable[] array = a.clone();
            System.out.println(selectionSort.sort(array));
        }

//        System.out.print("doubling ration experiment \n quicksort van  getallen");
//        System.out.print("we verwachten 13815 vergelijkingen");
//        System.out.println("quick sort test");
//        for(int i = 1; i <= 100000000; i*=2) {
//            Integer[] a = new Integer[i];
//            for (int ii = 0; ii < i; ii++) {
//                a[ii] = random.nextInt();
//            }
//            Comparable[] array = a.clone();
//            oWatch.reset();
//            oWatch.start();
//            quickSort.sort(array);
//            oWatch.suspend();
//            //System.out.println(i + " " + quickSort.sort(array));
//            System.out.println(oWatch.getTime());
//        }

        System.out.print("doubling ration experiment \n insertionSort van 1000 getallen");
        System.out.print("we verwachten 250000 vergelijkingen");
        System.out.println("insertionSort test");
        for(int i = 1; i <= 10000000; i*=2) {
            Integer[] a = new Integer[i];
            for (int ii = 0; ii < i; ii++) {
                a[ii] = random.nextInt();
            }
            Comparable[] array = a.clone();
            oWatch.reset();
            oWatch.start();
            insertionSort.sort(array);
            oWatch.suspend();
            //System.out.println(i + " " + insertionsort.sort(array));
            System.out.println(oWatch.getTime());
        }
	}
}
