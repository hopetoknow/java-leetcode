package com.hopetoknow._2859_sum_of_values_at_indices_with_k_set_bits;

import java.util.List;

class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        if (k == 0) {
            return nums.get(0);
        }

        int sum = 0;

        for (int i = 1; i < nums.size(); i++) {
            if (Integer.bitCount(i) == k) {
                sum += nums.get(i);
            }
        }

        return sum;
    }
}
