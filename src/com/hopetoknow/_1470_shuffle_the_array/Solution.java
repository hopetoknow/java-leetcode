package com.hopetoknow._1470_shuffle_the_array;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[n * 2];

        for (int i = 0; i < n; i++) {
            answer[2 * i] = nums[i];
            answer[2 * i + 1] = nums[n + i];
        }

        return answer;
    }
}
