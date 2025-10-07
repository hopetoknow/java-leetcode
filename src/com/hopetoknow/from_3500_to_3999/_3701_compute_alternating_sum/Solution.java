package com.hopetoknow.from_3500_to_3999._3701_compute_alternating_sum;

class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            } else {
                sum -= nums[i];
            }
        }

        return sum;
    }
}
