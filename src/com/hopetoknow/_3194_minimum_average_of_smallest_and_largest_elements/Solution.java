package com.hopetoknow._3194_minimum_average_of_smallest_and_largest_elements;

import java.util.Arrays;

class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        double[] averages = new double[n / 2];

        Arrays.sort(nums);

        for (int i = 0; i < n / 2; i++) {
            averages[i] = nums[i] + nums[n - 1 - i];
        }

        double ans = averages[0];

        for (int i = 1; i < n / 2; i++) {
            ans = Math.min(ans, averages[i]);
        }

        return ans / 2.0;
    }
}
