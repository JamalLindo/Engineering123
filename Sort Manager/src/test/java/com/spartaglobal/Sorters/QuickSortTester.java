package com.spartaglobal.Sorters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.spartaglobal.Sorters.QuickSort.quickSort;

public class QuickSortTester {


    @Test
    public void testQuickSort() {
        int[] unsortedArray = {7 ,82 ,1 ,29 ,21 ,22 ,9};
        int[] sortedArray = {1 ,7 ,9 ,21 ,22 ,29 ,82};
        Assertions.assertEquals(Arrays.toString(quickSort(unsortedArray)), Arrays.toString(sortedArray));
    }
}
