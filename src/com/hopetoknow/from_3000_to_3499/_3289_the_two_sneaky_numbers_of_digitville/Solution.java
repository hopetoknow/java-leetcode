package com.hopetoknow.from_3000_to_3499._3289_the_two_sneaky_numbers_of_digitville;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[2];
        int i = 0;

        for (Integer key : map.keySet()) {
            if (map.get(key)  == 2) {
                ans[i++] = key;

                if (i == 2) {
                    break;
                }
            }
        }

        return ans;
    }

    public int[] getSneakyNumbers2(int[] nums) {
        int[] count = new int[100];
        int[] ans = new int[2];
        int i = 0;

        for (int num : nums) {
            if (++count[num] == 2) {
                ans[i++] = num;

                if (i == 2) {
                    break;
                }
            }
        }

        return ans;
    }
}
