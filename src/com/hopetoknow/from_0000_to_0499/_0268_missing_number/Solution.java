package com.hopetoknow.from_0000_to_0499._0268_missing_number;

import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        int expectedSum = 0;

        for (int i = 1; i <= nums.length; i++) {
            expectedSum += i;
        }

        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public int missingNumber2(int[] nums) {
        int sum = 0, n = nums.length;

        for (int num : nums) {
            sum += num;
        }

        return n * (n + 1) / 2 - sum;
    }

    public int missingNumber3(int[] nums) {
        int n = nums.length;
        int ans = n;

        for (int i = 0; i < n; i++) {
            ans += i - nums[i];
        }

        return ans;
    }

    public int missingNumber4(int[] nums) {
        int n = nums.length;
        int ans = n;

        for (int i = 0; i < n; i++) {
            ans ^= i ^ nums[i];
        }

        return ans;
    }

    public int missingNumber5(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid == nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
