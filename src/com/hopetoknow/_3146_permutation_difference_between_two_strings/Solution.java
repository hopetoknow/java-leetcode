package com.hopetoknow._3146_permutation_difference_between_two_strings;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), i);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans += Math.abs(map.get(t.charAt(i)) - i);
        }

        return ans;
    }
}
