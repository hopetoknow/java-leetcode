package com.hopetoknow.from_3000_to_3499._3190_find_minimum_operations_to_make_all_elements_divisible_by_three;

import java.util.Arrays;

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

    public int minimumOperations2(int[] nums) {
        return Arrays.stream(nums)
                .map(num -> num % 3 != 0 ? 1 : 0)
                .sum();
    }
}
