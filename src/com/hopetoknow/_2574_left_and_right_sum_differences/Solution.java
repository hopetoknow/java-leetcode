package com.hopetoknow._2574_left_and_right_sum_differences;

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        for (int i = 0, sum = 0; i < n; i++) {
            leftSum[i] = sum;
            sum += nums[i];
        }

        for (int i = n - 1, sum = 0; i >= 0; i--) {
            rightSum[i] = sum;
            sum += nums[i];
        }

        for (int i = 0; i < n; i++) {
            leftSum[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return leftSum;
    }

    public int[] leftRightDifference2(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            leftSum[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return leftSum;
    }

    public int[] leftRightDifference3(int[] nums) {
        int n = nums.length;
        int leftSum = 0;
        int rightSum = 0;

        for (int num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            rightSum -= num;
            nums[i] = Math.abs(leftSum - rightSum);
            leftSum += num;
        }

        return nums;
    }

    public int[] leftRightDifference4(int[] nums) {
        int n = nums.length;
        int leftSum = 0;
        int rightSum = 0;

        for (int num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < n; i++) {
            leftSum += nums[i];
            rightSum -= nums[i];
            nums[i] = Math.abs(leftSum - nums[i] - rightSum);
        }

        return nums;
    }
}
