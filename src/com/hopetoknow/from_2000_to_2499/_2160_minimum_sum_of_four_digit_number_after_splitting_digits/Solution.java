package com.hopetoknow.from_2000_to_2499._2160_minimum_sum_of_four_digit_number_after_splitting_digits;

import java.util.Arrays;

class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];

        for (int i = 0; i < 4; i++) {
            digits[i] = num % 10;
            num /= 10;
        }

        Arrays.sort(digits);

        return 10 * digits[0]  + digits[2] + 10 * digits[1] + digits[3];
    }

    public int minimumSum2(int num) {
        char[] digits = ("" + num).toCharArray();

        Arrays.sort(digits);

        return Integer.parseInt("" + digits[0] + digits[2]) + Integer.parseInt("" + digits[1] + digits[3]);
    }
}
