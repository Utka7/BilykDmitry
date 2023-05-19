package org.example;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class NumberSumCalculatorTest {

    @Test
    void positiveSum_UsualList_ExpectedResult() {
        List<Integer> list = Arrays.asList(1, 2, 3, -3, 4, 5, 6);
        int expectedSum = 21;

        int actualSum = NumberSumCalculator.calculatePositiveSum(list);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    void negativeSum_UsualList_ExpectedResult() {
        List<Integer> list = Arrays.asList(-1, -2, 3, -3, 4, -5, 6);
        int expectedSum = -11;

        int actualSum = NumberSumCalculator.calculateNegativeSum(list);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    void positiveSum_NonPositiveNumber_ExpectedResult() {
        List<Integer> list = Arrays.asList(-1, -2, -3, -3, -4, -5, -6);
        int expectedSum = 0;

        int actualSum = NumberSumCalculator.calculatePositiveSum(list);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    void positiveSum_NonNegativeNumber_ExpectedResult() {
        List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 5, 6);
        int expectedSum = 0;

        int actualSum = NumberSumCalculator.calculateNegativeSum(list);
        Assert.assertEquals(expectedSum, actualSum);
    }
}