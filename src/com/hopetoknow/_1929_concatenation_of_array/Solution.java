package com.hopetoknow._1929_concatenation_of_array;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];

        for (int i = 0; i < n; i++) {
            ans[i] = ans[i + n] = nums[i];
        }

        return ans;
    }

    public int[] getConcatenation2(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n << 1];

        for (int i = 0; i < n << 1; i++) {
            ans[i] = nums[i % n];
        }

        return ans;
    }
}
