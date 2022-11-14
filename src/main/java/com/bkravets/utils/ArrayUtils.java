package com.bkravets.utils;

public class ArrayUtils {

    public static int binarySearch(int[] array, int element) {

        if(array == null) throw new IllegalArgumentException("Array could not be null");

        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex < endIndex) {
            int midIndex = (startIndex + endIndex) / 2;

            if(element < array[midIndex]) {
                endIndex = midIndex - 1;
            } else if(element > array[midIndex]) {
                startIndex = midIndex + 1;
            } else {
                return midIndex;
            }
        }

        return -1;
    }


    public static void bubbleSort(int[] array) {

        if(array == null) throw new IllegalArgumentException("Array could not be null");

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }

    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}