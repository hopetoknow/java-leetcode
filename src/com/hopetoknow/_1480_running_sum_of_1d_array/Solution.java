package com.hopetoknow._1480_running_sum_of_1d_array;

class Solution {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];
        answer[0] = nums[0];

        for (int i = 1; i < length; i++) {
            answer[i] = answer[i - 1] + nums[i];
        }

        return answer;
    }

    public int[] runningSum2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }
}
