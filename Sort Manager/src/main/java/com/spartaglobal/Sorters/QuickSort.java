package com.spartaglobal.Sorters;

import com.spartaglobal.Loggers.CustomFormatter;

import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class QuickSort {

    private static final Logger qsLogger = Logger.getLogger("QuickSort logger");

    private static void logSetUp(){
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.INFO);
        consoleHandler.setFormatter(new CustomFormatter());
        qsLogger.setLevel(Level.OFF);
        qsLogger.addHandler(consoleHandler);
    }

    /**
     *  quickSort
     * @param arr
     * @return
     */
    public static int[] quickSort(int[] arr){

        logSetUp();
        long startTime = System.nanoTime();
        qsLogger.log(Level.INFO, "Starting Quick Sort");

        // run quick sort with the length of the array
        qSort(arr, 0, arr.length - 1);

        // print results
        System.out.println(Arrays.toString(arr));

        //log the time the sort had taken
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        System.out.println("Time Taken = " + elapsedTime + " nano second's");

        return arr;
    }

    private static void qSort(int[] arr, int low, int high) {

        // if low is less than high , should be always true unless array is empty
        qsLogger.log(Level.FINE, "Checking high against low");
        if(low < high){
            // int p = partition
            int p = partition(arr, low, high);
            //run quicksort with partition high
            qSort(arr, low, p-1);
            //run quicksort with partition low
            qSort(arr, p+1, high);
        }
    }

    private static int partition (int[] arr, int low, int high){
        int p = low;
        int j;
        qsLogger.log(Level.FINE, "getting partition");

        for(j=low+1; j <= high; j++)
            //if array index at position J is less than array index at position low swap
            if(arr[j] < arr[low]) {
                qsLogger.log(Level.FINER, "swapping if position is lower than lowest position");
                swap(arr, ++p, j);
            }
        // swap positions
        swap(arr, low, p);

        return p;
    }

    private static void swap(int[] arr, int low, int pivot){
        //swap positions using a temp variable
        int tmp = arr[low];
        arr[low] = arr[pivot];
        arr[pivot] = tmp;
    }
}
