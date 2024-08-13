package com.hopetoknow.from_2500_to_2999._2535_difference_between_element_sum_and_digit_sum_of_an_array;

import java.util.Arrays;

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

    public int differenceOfSum3(int[] nums) {
        int elementSum = Arrays.stream(nums).sum();
        int digitSum = Arrays.stream(nums)
                .map(num -> String.valueOf(num)
                        .chars()
                        .map(Character::getNumericValue)
                        .sum())
                .sum();

        return Math.abs(elementSum - digitSum);
    }
}