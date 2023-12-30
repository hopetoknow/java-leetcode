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
}
