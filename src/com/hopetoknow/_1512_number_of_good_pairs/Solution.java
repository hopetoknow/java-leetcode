package com.hopetoknow._1512_number_of_good_pairs;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int numCount = numsMap.getOrDefault(num, 0);
            count += numCount;
            numsMap.put(num, numCount + 1);
        }

        return count;
    }
}
