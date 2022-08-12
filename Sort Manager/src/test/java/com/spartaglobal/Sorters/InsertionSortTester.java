package com.spartaglobal.Sorters;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.spartaglobal.Sorters.InsertionSort.insertSort;

public class InsertionSortTester {

    @Test
    public void testInsertionSort() {
        int[] unsortedArray = {7 ,82 ,1 ,29 ,21 ,22 ,9};
        int[] sortedArray = {1 ,7 ,9 ,21 ,22 ,29 ,82};
        Assertions.assertEquals(Arrays.toString(insertSort(unsortedArray)), Arrays.toString(sortedArray));
    }
}
