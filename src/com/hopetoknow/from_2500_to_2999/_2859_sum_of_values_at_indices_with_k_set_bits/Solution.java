package com.hopetoknow.from_2500_to_2999._2859_sum_of_values_at_indices_with_k_set_bits;

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

    public int sumIndicesWithKSetBits2(List<Integer> nums, int k) {
        if (k == 0) {
            return nums.get(0);
        }

        int sum = 0;

        for (int i = 1; i < nums.size(); i++) {
            if (bitCount(i) == k) {
                sum += nums.get(i);
            }
        }

        return sum;
    }

    private int bitCount(int number) {
        int count = 0;

        while (number > 0) {
            if (number % 2 == 1) {
                count++;
            }

            number = number >> 1;
        }

        return count;
    }
}
