package com.hopetoknow.from_1000_to_1499._1464_maximum_product_of_two_elements_in_an_array;

import java.util.Arrays;

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                ans = Math.max(ans, (nums[i] - 1) * (nums[j] - 1));
            }
        }

        return ans;
    }

    public int maxProduct2(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int max1 = nums[n - 1];
        int max2 = nums[n - 2];

        return (max1 - 1) * (max2 - 1);
    }

    public int maxProduct3(int[] nums) {
        int max1 = 1;
        int max2 = 1;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}
