package com.hopetoknow._3065_minimum_operations_to_exceed_threshold_value_i;

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
}
