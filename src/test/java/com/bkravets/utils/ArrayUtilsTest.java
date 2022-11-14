package com.bkravets.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class ArrayUtilsTest {

    @Test
    void binarySearch_shouldReturnIndexOfFoundElement() {

        int[] arr = {1, 2, 3, 4, 5};

        int element = ArrayUtils.binarySearch(arr, 3);

        Assertions.assertThat(element)
                .isEqualTo(2);
    }

    @Test
    void binarySearch_shouldReturnMinusOneWhenElementNotPresent() {

        int[] arr = {1, 2, 3, 4, 5};

        int element = ArrayUtils.binarySearch(arr, 10);

        Assertions.assertThat(element)
                .isEqualTo(-1);
    }

    @Test
    void binarySearch_shouldThrowExceptionWhenArrayIsNull() {

        int[] arr = null;

        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> ArrayUtils.binarySearch(arr, 10))
                .withMessage("Array could not be null");
    }

    @Test
    void bubbleSort_ShouldSortArray() {
        int[] arr = {0, -1, 2, 3, 2, 1, 0};

        ArrayUtils.bubbleSort(arr);

        Assertions.assertThat(arr)
                .isSorted();
    }

    @Test
    void bubbleSort_shouldThrowExceptionWhenArrayIsNull() {
        int[] arr = null;

        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> ArrayUtils.bubbleSort(arr))
                .withMessage("Array could not be null");
    }


}