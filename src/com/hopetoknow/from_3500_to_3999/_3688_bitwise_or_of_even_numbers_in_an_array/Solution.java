package com.hopetoknow.from_3500_to_3999._3688_bitwise_or_of_even_numbers_in_an_array;

import java.util.Arrays;

class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                ans |= num;
            }
        }

        return ans;
    }

    public int evenNumberBitwiseORs2(int[] nums) {
        return Arrays.stream(nums)
                .filter(num -> num % 2 == 0)
                .reduce(1, (a, b) -> a | b);
    }
}
