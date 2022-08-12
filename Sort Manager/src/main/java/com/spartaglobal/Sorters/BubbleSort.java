package com.spartaglobal.Sorters;

import java.util.Arrays;

public class BubbleSort {

    /**
     * Bubble sort
     * @param numbers
     * @return int[]
     */
    public static int[]  bubbleSort(int[] numbers){
        // get length of array
        int numLength = numbers.length;

        // loop until the length of the array is met.
        for (int loop = 0; loop < numLength; loop++) {
            //loop through each position of the length of the array
            for (int pos = 0; pos < numLength - loop - 1  ; pos++) {
                //swap if element at current position is greater than next position
                if (numbers[pos] > numbers[pos +1]) {
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
