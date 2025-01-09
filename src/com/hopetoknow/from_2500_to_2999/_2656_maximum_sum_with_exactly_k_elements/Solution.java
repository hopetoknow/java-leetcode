package com.hopetoknow.from_2500_to_2999._2656_maximum_sum_with_exactly_k_elements;

import java.util.Arrays;

class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int ans = 0;

        for (int i = 0; i < k; i++) {
            ans += max;
            max++;
        }

        return ans;
    }
}
