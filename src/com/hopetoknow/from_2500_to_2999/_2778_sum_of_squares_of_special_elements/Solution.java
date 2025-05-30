package com.hopetoknow.from_2500_to_2999._2778_sum_of_squares_of_special_elements;

import java.util.stream.IntStream;

class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += nums[i - 1] * nums[i - 1];
            }
        }

        return sum;
    }

    public int sumOfSquares2(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                sum += nums[i - 1] * nums[i - 1];

                if (i != n / i) {
                    int otherDivisor = n / i;
                    sum += nums[otherDivisor - 1] * nums[otherDivisor - 1];
                }
            }
        }

        return sum;
    }

    public int sumOfSquares3(int[] nums) {
        int n = nums.length;

        return IntStream.rangeClosed(1, n)
                .filter(i -> n % i == 0)
                .map(i -> nums[i - 1] * nums[i - 1])
                .sum();
    }
}
