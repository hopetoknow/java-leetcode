package com.hopetoknow.from_2500_to_2999._2578_split_with_minimum_sum;

import java.util.Arrays;

class Solution {
    public int splitNum(int originalNumber) {
        char[] digits = Integer.toString(originalNumber).toCharArray();
        Arrays.sort(digits);

        StringBuilder firstNumber = new StringBuilder();
        StringBuilder secondNumber = new StringBuilder();

        for (int i = 0; i < digits.length; i++) {
            if (i % 2 == 0) {
                firstNumber.append(digits[i]);
            } else {
                secondNumber.append(digits[i]);
            }
        }

        int num1 = Integer.parseInt(firstNumber.toString());
        int num2 = Integer.parseInt(secondNumber.toString());

        return num1 + num2;
    }
}
