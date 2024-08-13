package com.hopetoknow.from_3000_to_3499._3065_minimum_operations_to_exceed_threshold_value_i;

import java.util.Arrays;

class Solution {
    public int minOperations(int[] nums, int k) {
        int ans = 0;

        for (int num : nums) {
            if (num < k) {
                ans++;
            }
        }

        return ans;
    }

    public int minOperations2(int[] nums, int k) {
        return (int) Arrays.stream(nums)
                .filter(num -> num < k)
                .count();
    }
}
