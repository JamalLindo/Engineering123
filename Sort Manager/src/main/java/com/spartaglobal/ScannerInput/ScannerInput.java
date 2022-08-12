package com.spartaglobal.ScannerInput;

import java.util.Scanner;

import static com.spartaglobal.Controller.Controller.ArrayGen;
import static com.spartaglobal.Controller.Controller.SortController;

public class ScannerInput {
    public static void main(String[] args) {
        int arrayIndex = ArraySort();
        int[] array = ArrayGen(arrayIndex);
        int choice = ScannerSort();
        SortController(choice,array);
    }

    public static int ArraySort(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Boundary of the array will be -1,000 to 1000");
        System.out.print("What will be the index of your array : ");

        int ArrayIndex = myObj.nextInt();
        System.out.println("Array length will be : " + ArrayIndex);

        return ArrayIndex;
    }

    public static int ScannerSort(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("You have 4 Options to ArraySorter to choose from");
        System.out.println("1 : BubbleSort");
        System.out.println("2 : InsertionSort");
        System.out.println("3 : QuickSort");
        System.out.println("4 : MergeSort");
        System.out.println("5 : Exit");
        System.out.print("Enter your choice of Array Sort : ");

        int choice = myObj.nextInt();

        return choice;
    }
}
