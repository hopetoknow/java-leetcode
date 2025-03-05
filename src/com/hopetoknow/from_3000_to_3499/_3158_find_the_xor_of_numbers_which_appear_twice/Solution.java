package com.hopetoknow.from_3000_to_3499._3158_find_the_xor_of_numbers_which_appear_twice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                ans ^= entry.getKey();
            }
        }

        return ans;
    }

    public int duplicateNumbersXOR2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) == 2) {
                ans ^= num;
            }
        }

        return ans;
    }

    public int duplicateNumbersXOR3(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int ans = 0;

        for (int num : nums) {
            if (seen.contains(num)) {
                ans ^= num;
            } else {
                seen.add(num);
            }
        }

        return ans;
    }
}
