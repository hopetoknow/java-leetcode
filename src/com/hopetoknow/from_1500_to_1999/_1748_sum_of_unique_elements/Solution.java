package com.hopetoknow.from_1500_to_1999._1748_sum_of_unique_elements;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (map.get(num) == 1) {
                ans += num;
            }
        }

        return ans;
    }

    public int sumOfUnique2(int[] nums) {
        int[] count = new int[101];

        for (int num : nums) {
            count[num]++;
        }

        int ans = 0;

        for (int num : nums) {
            if (count[num] == 1) {
                ans += num;
            }
        }

        return ans;
    }

    public int sumOfUnique3(int[] nums) {
        int[] count = new int[101];
        int ans = 0;

        for (int num : nums) {
            count[num]++;

            if (count[num] == 1) {
                ans += num;
            } else if (count[num] == 2) {
                ans -= num;
            }
        }

        return ans;
    }
}
