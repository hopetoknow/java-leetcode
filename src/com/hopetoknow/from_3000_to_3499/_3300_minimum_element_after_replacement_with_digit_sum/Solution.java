package com.hopetoknow.from_3000_to_3499._3300_minimum_element_after_replacement_with_digit_sum;

class Solution {
    public int minElement(int[] nums) {
        int ans = 36;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int num = nums[i]; num > 0; num /= 10) {
                sum += num % 10;
            }

            nums[i] = sum;
            ans = Math.min(ans, sum);
        }

        return ans;
    }
}
