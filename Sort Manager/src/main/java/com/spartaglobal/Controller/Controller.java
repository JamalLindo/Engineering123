package com.spartaglobal.Controller;


import com.spartaglobal.Sorters.BubbleSort;
import com.spartaglobal.Sorters.InsertionSort;
import com.spartaglobal.Sorters.QuickSort;
import com.spartaglobal.Sorters.SplitMergeSort;

import java.util.Arrays;
import java.util.Random;

import static com.spartaglobal.ScannerInput.ScannerInput.ScannerSort;


public class Controller {

    public static void SortController(int i , int[] array){
        int choice =  i;
        if(choice == 1){
            System.out.println("you have chosen BubbleSort : " + choice);
            BubbleSort.bubbleSort(array);
            ScannerSort();
        }else if (choice == 2){
            System.out.println("you have chosen InsertionSort : " + choice);
            InsertionSort.insertSort(array);
        }else if (choice == 3){
            System.out.println("you have chosen QuickSort : " + choice);
            QuickSort.quickSort(array);
        }else if (choice == 4){
            System.out.println("you have chosen MergeSort : " + choice);
            SplitMergeSort.splitMergeArray(array);
        }else{
            System.out.println("you haven't chosen a sorting method. ");
            ScannerSort();
        }
    }

    public static int[] ArrayGen(int Array){
        int ArrayLength = Array;
        int[] array = new int [ArrayLength];

        for (int i = 0; i < ArrayLength; i++) {
            Random random = new Random();
            array[i] = random.nextInt(10)+ 1;
        }

        System.out.println("Random Generated Array : " + Arrays.toString(array));
        return array;
    }
}
