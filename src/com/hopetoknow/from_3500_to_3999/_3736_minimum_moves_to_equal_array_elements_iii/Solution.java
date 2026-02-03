package com.hopetoknow.from_3500_to_3999._3736_minimum_moves_to_equal_array_elements_iii;

import java.util.Arrays;

class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int max = nums[nums.length - 1];

        for (int num : nums) {
            ans += max - num;
        }

        return ans;
    }

    public int minMoves2(int[] nums) {
        int max = nums[0];

        for (int num : nums) {
            max = Math.max(max, num);
        }

        int ans = 0;

        for (int num : nums) {
            ans += max - num;
        }

        return ans;
    }
}
