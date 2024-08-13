package com.hopetoknow.from_3000_to_3499._3110_score_of_a_string;

import java.util.stream.IntStream;

class Solution {
    public int scoreOfString(String s) {
        int ans = 0;

        for (int i = 1; i < s.length(); i++) {
            ans += Math.abs(s.charAt(i - 1) - s.charAt(i));
        }

        return ans;
    }

    public int scoreOfString2(String s) {
        return IntStream.range(1, s.length())
                .map(i -> Math.abs(s.charAt(i - 1) - s.charAt(i)))
                .sum();
    }
}
