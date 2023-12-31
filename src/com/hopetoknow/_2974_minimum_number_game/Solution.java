package com.hopetoknow._2974_minimum_number_game;

import java.util.Arrays;

class Solution {
    public int[] numberGame(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];

        Arrays.sort(nums);

        for (int i = 0; i < length; i += 2) {
            answer[i] = nums[++i];
            answer[i] = nums[--i];
        }

        return answer;
    }

    public int[] numberGame2(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i += 2) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }

        return nums;
    }
}
