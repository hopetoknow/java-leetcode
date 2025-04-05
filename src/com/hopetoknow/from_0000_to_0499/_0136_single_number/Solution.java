package com.hopetoknow.from_0000_to_0499._0136_single_number;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            ans ^= num;
        }

        return ans;
    }

    public int singleNumber2(int[] nums) {
        return Arrays.stream(nums).reduce(0, (a, b) -> a ^ b);
    }

    public int singleNumber3(int[] nums) {
        return Arrays.stream(nums).reduce((a, b) -> a ^ b).getAsInt();
    }

    public int singleNumber4(int[] nums) {
        IntBinaryOperator xor = (a, b) -> a ^ b;

        return Arrays.stream(nums).reduce(xor).getAsInt();
    }
}
