package com.hopetoknow.from_1500_to_1999._1684_count_the_number_of_consistent_strings;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();

        for (char ch : allowed.toCharArray()) {
            set.add(ch);
        }

        int ans = 0;

        for (String word : words) {
            boolean valid = true;

            for (char ch : word.toCharArray()) {
                if (!set.contains(ch)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                ans++;
            }
        }

        return ans;
    }
}
