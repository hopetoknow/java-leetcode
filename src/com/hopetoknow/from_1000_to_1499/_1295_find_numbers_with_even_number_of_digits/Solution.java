package com.hopetoknow.from_1000_to_1499._1295_find_numbers_with_even_number_of_digits;

class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            int count = 0;

            while (num > 0) {
                num /= 10;
                count++;
            }

            if (count % 2 == 0) {
                ans++;
            }
        }

        return ans;
    }

    public int findNumbers2(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                ans++;
            }
        }

        return ans;
    }
}
