package com.hopetoknow.from_3500_to_3999._3760_maximum_substrings_with_distinct_start;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maxDistinct(String s) {
        Set<Character> ans = new HashSet<>();

        for (char ch : s.toCharArray()) {
            ans.add(ch);
        }

        return ans.size();
    }

    public int maxDistinct2(String s) {
        boolean[] seen = new boolean[26];
        int count = 0;

        for (char ch : s.toCharArray()) {
            int index = ch - 'a';

            if (!seen[index]) {
                seen[index] = true;
                count++;
            }

            if (count == 26) {
                return 26;
            }
        }

        return count;
    }

    public int maxDistinct3(String s) {
        return (int)s.chars().distinct().count();
    }

    public int maxDistinct4(String s) {
        int mask = 0;

        for (char ch : s.toCharArray()) {
            mask |= 1 << ch - 'a';
        }

        return Integer.bitCount(mask);
    }

    public int maxDistinct5(String s) {
        int[] freq = new int[26];
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (freq[ch - 'a']++ == 0) {
                count++;
            }

            if (count == 26) {
                return 26;
            }
        }

        return count;
    }
}
