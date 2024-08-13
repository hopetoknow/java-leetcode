package com.hopetoknow.from_2500_to_2999._2824_count_pairs_whose_sum_is_less_than_target;

import java.util.Collections;
import java.util.List;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int ans = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    ans++;
                }
            }
        }

        return ans;
    }

    public int countPairs2(List<Integer> nums, int target) {
        Collections.sort(nums);

        int left = 0;
        int right = nums.size() - 1;
        int ans = 0;

        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                ans += right - left;
                left++;
            } else {
                right--;
            }
        }

        return ans;
    }
}
