package com.hopetoknow.from_1000_to_1499._1295_find_numbers_with_even_number_of_digits;

import java.util.Arrays;

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

    public int findNumbers3(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            int count = (int) Math.log10(num) + 1;

            if (count % 2 == 0) {
                ans++;
            }
        }

        return ans;
    }

    public int findNumbers4(int[] nums) {
        return (int) Arrays.stream(nums)
                .map(num -> Integer.toString(num).length())
                .filter(n -> n % 2 == 0)
                .count();
    }
}
