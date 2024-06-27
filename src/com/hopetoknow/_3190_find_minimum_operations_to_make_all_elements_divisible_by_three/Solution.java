package com.hopetoknow._3190_find_minimum_operations_to_make_all_elements_divisible_by_three;

class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            if (num % 3 != 0) {
                ans++;
            }
        }

        return ans;
    }
}
