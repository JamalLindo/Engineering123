package com.spartaglobal.Sorters;

import java.util.Arrays;

public class InsertionSort {

    /**
     * Insert sort
     * @param array
     * @return int[]
     */
    public static int[]  insertSort(int [] array){

        // get the length of the array
        int arraySize = array.length;

        // i for iteration , iterate whilst i less than array size.
        for (int i = 1; i < arraySize; i++) {
            int key = array[i];
            int j = i - 1;

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
        return array;
    }
}
