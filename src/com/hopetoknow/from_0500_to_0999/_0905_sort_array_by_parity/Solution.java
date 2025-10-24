package com.hopetoknow.from_0500_to_0999._0905_sort_array_by_parity;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int left = 0, right = n - 1;

        for (int num : nums) {
            if ((num & 1) == 0) {
                ans[left++] = num;
            } else {
                ans[right--] = num;
            }
        }

        return ans;
    }
}
