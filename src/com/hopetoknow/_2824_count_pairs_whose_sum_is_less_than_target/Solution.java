package com.hopetoknow._2824_count_pairs_whose_sum_is_less_than_target;

import java.util.List;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int size = nums.size();
        int count = 0;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }

        return count;
    }
}
