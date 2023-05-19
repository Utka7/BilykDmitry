package org.example;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class NumberSumCalculatorTest {

    @Test
    void positiveSum_UsualList_ExpectedResult() {
        List<Integer> list = Arrays.asList(1, 2, 3, -3, 4, 5, 6);
        var expectedSum = 21;

        var actualSum = NumberSumCalculator.calculatePositiveSum(list);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    void negativeSum_UsualList_ExpectedResult() {
        List<Integer> list = Arrays.asList(-1, -2, 3, -3, 4, -5, 6);
        var expectedSum = -11;

        var actualSum = NumberSumCalculator.calculateNegativeSum(list);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    void positiveSum_NonPositiveNumber_ExpectedResult() {
        var list = Arrays.asList(-1, -2, -3, -3, -4, -5, -6);
        var expectedSum = 0;

        var actualSum = NumberSumCalculator.calculatePositiveSum(list);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    void positiveSum_NonNegativeNumber_ExpectedResult() {
        var list = Arrays.asList(1, 2, 3, 3, 4, 5, 6);
        var expectedSum = 0;

        var actualSum = NumberSumCalculator.calculateNegativeSum(list);
        Assert.assertEquals(expectedSum, actualSum);
    }
}