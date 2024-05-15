package com.hopetoknow._2535_difference_between_element_sum_and_digit_sum_of_an_array;

class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for (int num : nums) {
            elementSum += num;

            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }
        }

        return Math.abs(elementSum - digitSum);
    }

    public int differenceOfSum2(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            ans += num - (num / 1000 + num % 1000 / 100 + num % 100 / 10 + num % 10);
        }

        return Math.abs(ans);
    }
}