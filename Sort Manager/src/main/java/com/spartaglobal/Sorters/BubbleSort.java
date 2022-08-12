package com.spartaglobal.Sorters;

import com.spartaglobal.Loggers.CustomFormatter;

import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BubbleSort {
    private static final Logger bsLogger = Logger.getLogger("BubbleSort logger");

    private static void logSetUp(){
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.INFO);
        consoleHandler.setFormatter(new CustomFormatter());
        bsLogger.setLevel(Level.INFO);
        bsLogger.addHandler(consoleHandler);
    }

    /**
     * Bubble sort
     * @param numbers
     * @return int[]
     */
    public static int[]  bubbleSort(int[] numbers){
        logSetUp();

        bsLogger.log(Level.INFO, "Starting Bubble Sort");
        // get length of array
        int numLength = numbers.length;

        // loop until the length of the array is met.
        bsLogger.log(Level.FINE, "looping Through length of the array");
        for (int loop = 0; loop < numLength; loop++) {
            //loop through each position of the length of the array
            bsLogger.log(Level.FINER, "looping Through length of the array");
            for (int pos = 0; pos < numLength - loop - 1  ; pos++) {
                //swap if element at current position is greater than next position
                if (numbers[pos] > numbers[pos +1]) {
                    bsLogger.log(Level.FINEST, "Swapping positions");
                    int numHolder = numbers[pos];
                    numbers[pos] = numbers[pos + 1];
                    numbers[pos + 1] = numHolder;
                }
            }
        }
        // Print statement for Bubble Sort
        System.out.println("Sorted Array = " + Arrays.toString(numbers));
        return numbers;
    }
}
