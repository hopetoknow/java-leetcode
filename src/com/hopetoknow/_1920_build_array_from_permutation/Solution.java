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
}
