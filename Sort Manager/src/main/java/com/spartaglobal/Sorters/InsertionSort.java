package com.spartaglobal.Sorters;

import com.spartaglobal.Loggers.CustomFormatter;

import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertionSort {

    private static final Logger isLogger = Logger.getLogger("InsertionSort logger");

    private static void logSetUp(){
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.INFO);
        consoleHandler.setFormatter(new CustomFormatter());
        isLogger.setLevel(Level.OFF);
        isLogger.addHandler(consoleHandler);
    }

    /**
     * Insert sort
     * @param array
     * @return int[]
     */
    public static void insertSort(int [] array){
        logSetUp();
        long startTime = System.nanoTime();

        isLogger.log(Level.INFO, "Starting Insertion Sort");
        // get the length of the array
        int arraySize = array.length;

        isLogger.log(Level.FINE, "Looping Through the size of the array");
        // i for iteration , iterate whilst i less than array size.
        for (int i = 1; i < arraySize; i++) {
            int key = array[i];
            int j = i - 1;

            isLogger.log(Level.FINER, "Comparing elements with the key");
            // Compare key with each element on the left of it until an element smaller than it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            // Place key at after the element just smaller than it.
            array[j + 1] = key;
        }

        System.out.println(Arrays.toString(array));
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        System.out.println("Time Taken = " + elapsedTime + " nano second's");
    }
}
