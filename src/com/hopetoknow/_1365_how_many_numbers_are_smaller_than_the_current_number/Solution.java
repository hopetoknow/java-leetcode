package com.hopetoknow._1365_how_many_numbers_are_smaller_than_the_current_number;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            int counter = 0;

            for (int j = 0; j < length; j++) {
                if (nums[j] < nums[i]) {
                    counter++;
                }
            }

            answer[i] = counter;
        }

        return answer;
    }

    public int[] smallerNumbersThanCurrent2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] numsCopy = nums.clone();
        int length = nums.length;

        Arrays.sort(numsCopy);

        for (int i = 0; i < length; i++) {
            map.putIfAbsent(numsCopy[i], i);
        }

        for (int i = 0; i < length; i++) {
            numsCopy[i] = map.get(nums[i]);
        }

        return numsCopy;
    }
}
