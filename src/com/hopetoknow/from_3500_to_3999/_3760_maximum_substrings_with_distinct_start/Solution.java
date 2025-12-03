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
}
