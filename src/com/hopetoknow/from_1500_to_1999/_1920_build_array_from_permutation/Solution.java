package com.hopetoknow.from_1500_to_1999._1920_build_array_from_permutation;

class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public int[] buildArray2(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + n * (nums[nums[i]] % n);
        }

        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }

        return nums;
    }

    public int[] buildArray3(int[] nums) {
        int mask = 1023;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] |= (nums[nums[i]] & mask) << 10;
        }

        for (int i = 0; i < n; i++) {
            nums[i] >>= 10;
        }

        return nums;
    }
}
