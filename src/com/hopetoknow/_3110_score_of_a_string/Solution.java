package com.hopetoknow._3110_score_of_a_string;

class Solution {
    public int scoreOfString(String s) {
        int ans = 0;

        for (int i = 1; i < s.length(); i++) {
            ans += Math.abs(s.charAt(i - 1) - s.charAt(i));
        }

        return ans;
    }
}
