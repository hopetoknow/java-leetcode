package com.hopetoknow.from_3000_to_3499._3158_find_the_xor_of_numbers_which_appear_twice;

import java.util.HashMap;
import java.util.Map;

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
}
