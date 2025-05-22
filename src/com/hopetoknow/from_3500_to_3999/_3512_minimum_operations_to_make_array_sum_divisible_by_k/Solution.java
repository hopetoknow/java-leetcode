package com.hopetoknow.from_3500_to_3999._3512_minimum_operations_to_make_array_sum_divisible_by_k;

class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return sum % k;
    }
}
