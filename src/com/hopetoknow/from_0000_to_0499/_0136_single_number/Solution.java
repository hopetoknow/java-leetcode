package com.hopetoknow.from_0000_to_0499._0136_single_number;

import java.util.Arrays;

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
}
