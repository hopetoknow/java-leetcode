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

    public int splitNum2(int originalNumber) {
        char[] digits = Integer.toString(originalNumber).toCharArray();
        Arrays.sort(digits);

        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < digits.length; i++) {
            int digit = digits[i] - '0';

            if (i % 2 == 0) {
                num1 = num1 * 10 + digit;
            } else {
                num2 = num2 * 10 + digit;
            }
        }

        return num1 + num2;
    }

    public int splitNum3(int originalNumber) {
        char[] digits = Integer.toString(originalNumber).toCharArray();
        Arrays.sort(digits);

        int[] nums = new int[2];

        for (int i = 0; i < digits.length; i++) {
            int digit = digits[i] - '0';
            nums[i & 1] = nums[i & 1] * 10 + digit;
        }

        return nums[0] + nums[1];
    }

    public int splitNum4(int originalNumber) {
        int[] freq = new int[10];

        while (originalNumber > 0) {
            freq[originalNumber % 10]++;
            originalNumber /= 10;
        }

        int num1 = 0;
        int num2 = 0;
        boolean isNum1Turn = true;

        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                if (isNum1Turn) {
                    num1 = num1 * 10 + i;
                } else {
                    num2 = num2 * 10 + i;
                }

                isNum1Turn = !isNum1Turn;
                freq[i]--;
            }
        }

        return num1 + num2;
    }

    public int splitNum5(int originalNumber) {
        int[] freq = new int[10];

        while (originalNumber > 0) {
            freq[originalNumber % 10]++;
            originalNumber /= 10;
        }

        int num1 = 0;
        int num2 = 0;
        int turn = 0;

        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                if (turn % 2 == 0) {
                    num1 = num1 * 10 + i;
                } else {
                    num2 = num2 * 10 + i;
                }

                freq[i]--;
                turn++;
            }
        }

        return num1 + num2;
    }
}
