package com.hopetoknow._2574_left_and_right_sum_differences;

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int length = nums.length;
        int[] leftSum = new int[length];
        int[] rightSum = new int[length];

        for (int i = 0, sum = 0; i < length; i++) {
            leftSum[i] = sum;
            sum += nums[i];
        }

        for (int i = length - 1, sum = 0; i >= 0; i--) {
            rightSum[i] = sum;
            sum += nums[i];
        }

        for (int i = 0; i < length; i++) {
            leftSum[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return leftSum;
    }
}
