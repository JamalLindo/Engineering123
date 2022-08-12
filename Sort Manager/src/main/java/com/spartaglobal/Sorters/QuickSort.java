package com.spartaglobal.Sorters;

import java.util.Arrays;


public class QuickSort {

    /**
     *  quickSort
     * @param arr
     * @return
     */
    public static int[] quickSort(int[] arr){

        qSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    private static void qSort(int arr[], int low, int high) {
        if(low < high){
            int p = partition(arr, low, high);
            qSort(arr, low, p-1);
            qSort(arr, p+1, high);
        }
    }

    private static void swap(int[] arr, int low, int pivot){
        int tmp = arr[low];
        arr[low] = arr[pivot];
        arr[pivot] = tmp;
    }

    private static int partition (int[] arr, int low, int high){
        int p = low, j;
        for(j=low+1; j <= high; j++)
            if(arr[j] < arr[low])
                swap(arr, ++p, j);

        swap(arr, low, p);
        return p;
    }
}
