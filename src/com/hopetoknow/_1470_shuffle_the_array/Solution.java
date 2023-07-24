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

    public int[] shuffle2(int[] nums, int n) {
        int length = nums.length;
        int max = 1001;

        for (int i = n; i < length; i++) {
            nums[i] = (nums[i] * max) + nums[i - n];
        }

        int index = 0;

        for (int i = n; i < length; i++) {
            nums[index] = nums[i] % max;
            nums[index + 1] = nums[i] / max;
            index += 2;
        }

        return nums;
    }
}
