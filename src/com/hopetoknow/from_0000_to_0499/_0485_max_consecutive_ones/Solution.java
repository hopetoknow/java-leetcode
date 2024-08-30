package com.hopetoknow.from_0000_to_0499._0485_max_consecutive_ones;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int ans = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 0;
            }
        }

        ans = Math.max(ans, count);

        return ans;
    }
}
