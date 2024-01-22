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
        int len = nums.length;
        int max = 1001;

        for (int i = n; i < len; i++) {
            nums[i] = (nums[i] * max) + nums[i - n];
        }

        for (int i = 0, j = n; j < len; j++) {
            nums[i++] = nums[j] % max;
            nums[i++] = nums[j] / max;
        }

        return nums;
    }

    public int[] shuffle3(int[] nums, int n) {
        int max = 1001;

        for (int i = 0, j = 0, k = n; i < n * 2; j++, k++) {
            nums[i] = nums[i++] + max * (nums[j] % max);
            nums[i] = nums[i++] + max * (nums[k] % max);
        }

        for (int i = 0; i < n * 2; i++) {
            nums[i] /= max;
        }

        return nums;
    }
}
