package com.hopetoknow.from_1500_to_1999._1913_maximum_product_difference_between_two_pairs;

import java.util.Arrays;

class Solution {
    public int maxProductDifference(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        return nums[n - 1] * nums [n - 2] - nums[0] * nums[1];
    }
}
