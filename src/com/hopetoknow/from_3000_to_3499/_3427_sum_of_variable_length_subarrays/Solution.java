package com.hopetoknow.from_3000_to_3499._3427_sum_of_variable_length_subarrays;

class Solution {
    public int subarraySum(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int start = Math.max(0, i - nums[i]); start <= i; start++) {
                ans += nums[start];
            }
        }

        return ans;
    }
}
