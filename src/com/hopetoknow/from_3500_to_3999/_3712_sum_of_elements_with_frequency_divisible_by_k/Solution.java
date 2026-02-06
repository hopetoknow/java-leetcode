package com.hopetoknow.from_3500_to_3999._3712_sum_of_elements_with_frequency_divisible_by_k;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> frequencyByNumber = new HashMap<>();

        for (int num : nums) {
            frequencyByNumber.put(num, frequencyByNumber.getOrDefault(num, 0) + 1);
        }

        int sum = 0;

        for (int num : frequencyByNumber.keySet()){
            int frequency = frequencyByNumber.get(num);

            if (frequency % k == 0) {
                sum += num * frequency;
            }
        }

        return sum;
    }
}
