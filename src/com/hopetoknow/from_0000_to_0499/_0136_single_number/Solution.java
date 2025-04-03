package com.hopetoknow.from_0000_to_0499._0136_single_number;

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            ans ^= num;
        }

        return ans;
    }
}
