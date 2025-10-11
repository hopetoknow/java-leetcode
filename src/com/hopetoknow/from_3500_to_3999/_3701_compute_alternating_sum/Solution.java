package com.hopetoknow.from_3500_to_3999._3701_compute_alternating_sum;

import java.util.stream.IntStream;

class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            } else {
                sum -= nums[i];
            }
        }

        return sum;
    }

    public int alternatingSum2(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += (i & 1) == 0 ? nums[i] : -nums[i];
        }

        return sum;
    }

    public int alternatingSum3(int[] nums) {
        int sum = 0, sign = 1;

        for (int num : nums) {
            sum += num * sign;
            sign = -sign;
        }

        return sum;
    }

    public int alternatingSum4(int[] nums) {
        return IntStream.range(0, nums.length)
                .map(i -> (i & 1) == 0 ? nums[i] : -nums[i])
                .sum();
    }
}
