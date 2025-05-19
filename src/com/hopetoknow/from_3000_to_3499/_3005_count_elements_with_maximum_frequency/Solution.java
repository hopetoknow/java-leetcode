package com.hopetoknow.from_3000_to_3499._3005_count_elements_with_maximum_frequency;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 1;

        for (int f : freq.values()) {
            maxFreq = Math.max(maxFreq, f);
        }

        int maxFreqCount = 0;

        for (int f : freq.values()){
            if (f == maxFreq) {
                maxFreqCount++;
            }
        }

        return maxFreqCount * maxFreq;
    }
}
