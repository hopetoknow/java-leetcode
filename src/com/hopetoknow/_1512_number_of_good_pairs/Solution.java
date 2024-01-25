package com.hopetoknow._1512_number_of_good_pairs;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    ans++;
                }
            }
        }

        return ans;
    }

    public int numIdenticalPairs2(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        int ans = 0;

        for (int num : nums) {
            int numCount = numsMap.getOrDefault(num, 0);
            ans += numCount;
            numsMap.put(num, numCount + 1);
        }

        return ans;
    }

    public int numIdenticalPairs3(int[] nums) {
        int[] arr = new int[101];
        int ans = 0;

        for (int num : nums) {
            ans += arr[num]++;
        }

        return ans;
    }
}
