package com.hopetoknow.from_3000_to_3499._3146_permutation_difference_between_two_strings;

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

    public int findPermutationDifference2(String s, String t) {
        int[] abc = new int[26];
        int n = s.length();

        for (int i = 0; i < n; ++i) {
            abc[s.charAt(i) - 'a'] = i;
        }

        int ans = 0;

        for (int i = 0; i < n; ++i) {
            ans += Math.abs(abc[t.charAt(i) - 'a'] - i);
        }

        return ans;
    }
}
