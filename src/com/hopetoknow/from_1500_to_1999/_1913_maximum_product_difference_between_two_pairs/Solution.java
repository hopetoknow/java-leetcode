package com.hopetoknow.from_1500_to_1999._1913_maximum_product_difference_between_two_pairs;

import java.util.Arrays;

class Solution {
    public int maxProductDifference(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        return nums[n - 1] * nums [n - 2] - nums[0] * nums[1];
    }

    public int maxProductDifference2(int[] nums) {
        int max1 = 1, max2 = 1;
        int min1 = 10000, min2 = 10000;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return max1 * max2 - min1 * min2;
    }
}
