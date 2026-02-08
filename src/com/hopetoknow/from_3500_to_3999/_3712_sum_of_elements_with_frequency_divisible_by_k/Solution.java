package com.hopetoknow.from_3500_to_3999._3712_sum_of_elements_with_frequency_divisible_by_k;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> frequencyByNumber = new HashMap<>();

        for (int num : nums) {
            frequencyByNumber.put(num, frequencyByNumber.getOrDefault(num, 0) + 1);
        }

//        for (int num : nums) {
//            frequencyByNum.merge(num, 1, Integer::sum);
//        }

        int sum = 0;

        for (int num : frequencyByNumber.keySet()){
            int frequency = frequencyByNumber.get(num);

            if (frequency % k == 0) {
                sum += num * frequency;
            }
        }

        return sum;
    }

    public int sumDivisibleByK2(int[] nums, int k) {
        int[] frequencies = new int[101];

        for (int num : nums) {
            frequencies[num]++;
        }

        int sum = 0;

        for (int i = 0; i < frequencies.length; i++){
            if (frequencies[i] % k == 0) {
                sum += i * frequencies[i];
            }
        }

        return sum;
    }

    public int sumDivisibleByK3(int[] nums, int k) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(
                        n -> n,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() % k == 0)
                .mapToInt(e -> e.getKey() * e.getValue().intValue())
                .sum();
    }
}
