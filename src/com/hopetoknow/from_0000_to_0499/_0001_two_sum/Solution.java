package com.hopetoknow.from_0000_to_0499._0001_two_sum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[0];
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];

            if (!numToIndex.containsKey(current)) {
                numToIndex.put(nums[i], i);
            }

            int complement = target - current;

            if (numToIndex.containsKey(complement) && numToIndex.get(complement) != i) {
                return new int[]{numToIndex.get(complement), i};
            }
        }

        return new int[0];
    }
}
