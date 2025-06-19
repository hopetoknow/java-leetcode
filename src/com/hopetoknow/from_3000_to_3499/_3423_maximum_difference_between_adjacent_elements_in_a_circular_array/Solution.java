package com.hopetoknow.from_3000_to_3499._3423_maximum_difference_between_adjacent_elements_in_a_circular_array;

class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int max = Math.abs(nums[n - 1] - nums[0]);

        for (int i = 1; i < n; i++) {
            max = Math.max(max, Math.abs(nums[i] - nums[i - 1]));
        }

        return max;
    }

    public int maxAdjacentDistance2(int[] nums) {
        int n = nums.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, Math.abs(nums[i] - nums[(i + 1) % n]));
        }

        return max;
    }
}
