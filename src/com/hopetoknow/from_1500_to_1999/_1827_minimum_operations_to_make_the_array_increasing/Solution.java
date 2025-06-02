package com.hopetoknow.from_1500_to_1999._1827_minimum_operations_to_make_the_array_increasing;

class Solution {
    public int minOperations(int[] nums) {
        int totalOperations = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                totalOperations += nums[i - 1] - nums[i] + 1;
                nums[i] = nums[i - 1] + 1;
            }
        }

        return totalOperations;
    }

    public int minOperations2(int[] nums) {
        int totalOperations = 0;
        int previousValue = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= previousValue) {
                totalOperations += previousValue - nums[i] + 1;
                previousValue += 1;
            } else {
                previousValue = nums[i];
            }
        }

        return totalOperations;
    }
}
