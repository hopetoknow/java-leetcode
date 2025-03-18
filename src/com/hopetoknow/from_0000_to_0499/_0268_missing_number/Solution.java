package com.hopetoknow.from_0000_to_0499._0268_missing_number;

class Solution {
    public int missingNumber(int[] nums) {
        int expectedSum = 0;

        for (int i = 1; i <= nums.length; i++) {
            expectedSum += i;
        }

        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
