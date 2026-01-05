package com.hopetoknow.from_0500_to_0999._0961_n_repeated_element_in_size_2n_array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> numsToFrequencies = new HashMap<>();

        for (int num : nums) {
            numsToFrequencies.put(num, numsToFrequencies.getOrDefault(num, 0) + 1);

            if (numsToFrequencies.get(num) > 1) {
                return num;
            }
        }

        return -1;
    }

    public int repeatedNTimes2(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();

        for (int num : nums) {
            if (!numsSet.add(num)) {
                return num;
            }
        }

        return -1;
    }
}
