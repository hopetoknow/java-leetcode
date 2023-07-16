package com.hopetoknow._1920_build_array_from_permutation;

class Solution {
    public static int[] buildArray(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            answer[i] = nums[nums[i]];
        }

        return answer;
    }

    public static int[] buildArray2(int[] nums) {
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            nums[i] = nums[i] + length * (nums[nums[i]] % length);
        }

        for (int i = 0; i < length; i++) {
            nums[i] /= length;
        }

        return nums;
    }
}
