package com.hopetoknow.from_0000_to_0499._0189_rotate_array;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        if (n == 1) {
            return;
        }

        k = k % n;

        if (k == 0) {
            return;
        }

        int[] rotatedNums = new int[n];

        for (int i = 0; i < n; i++) {
            rotatedNums[i] = nums[(n - k + i) % n];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = rotatedNums[i];
        }
    }

    public void rotate2(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        if (k == 0) {
            return;
        }

        int[] rotatedNums = new int[n];

        for (int i = 0; i < n; i++) {
            rotatedNums[(i + k) % n] = nums[i];
        }

        System.arraycopy(rotatedNums, 0, nums, 0, n);
    }
}
