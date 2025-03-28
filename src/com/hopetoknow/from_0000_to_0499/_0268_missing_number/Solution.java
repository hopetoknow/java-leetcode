package com.hopetoknow.from_0000_to_0499._0268_missing_number;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

    public int missingNumber6(int[] nums) {
        int[] present = new int[nums.length + 1];
        Arrays.fill(present, -1);

        for (int num : nums) {
            present[num] = num;
        }

        for (int i = 0; i < present.length; i++) {
            if (present[i] == -1) {
                return i;
            }
        }

        return -1;
    }

    public int missingNumber7(int[] nums) {
        Set<Integer> present = new HashSet<>();

        for (int num : nums) {
            present.add(num);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!present.contains(i)) {
                return i;
            }
        }

        return -1;
    }

    public int missingNumber8(int[] nums) {
        int n = nums.length;
        boolean[] present = new boolean[n + 1];

        for (int num : nums) {
            present[num] = true;
        }

        for (int i = 0; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }

        return -1;
    }
}
