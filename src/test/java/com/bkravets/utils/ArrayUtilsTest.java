package com.bkravets.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class ArrayUtilsTest {

    @Test
    void binarySearch_shouldFindElement() {

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
}