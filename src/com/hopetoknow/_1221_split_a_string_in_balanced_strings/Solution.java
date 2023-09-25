package com.hopetoknow._1221_split_a_string_in_balanced_strings;

class Solution {
    public int balancedStringSplit(String s) {
        int answer = 0;
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'L') {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                answer++;
            }
        }

        return answer;
    }
}
