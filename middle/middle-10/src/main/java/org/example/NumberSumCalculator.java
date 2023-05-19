package org.example;

import java.util.List;

public class NumberSumCalculator {

    public static int calculatePositiveSum(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number > 0)
                .reduce(0, Integer::sum);
    }

    public static int calculateNegativeSum(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number < 0)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
