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
}