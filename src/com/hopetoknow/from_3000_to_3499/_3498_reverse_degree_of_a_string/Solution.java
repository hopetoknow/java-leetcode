package com.hopetoknow.from_3000_to_3499._3498_reverse_degree_of_a_string;

import java.util.stream.IntStream;

class Solution {
    public int reverseDegree(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int reverseAlphabetIndex = 26 - (s.charAt(i) - 'a');
            ans += reverseAlphabetIndex * (i + 1);
        }

        return ans;
    }

    public int reverseDegree2(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int reverseAlphabetIndex = 123 - s.charAt(i);
            ans += reverseAlphabetIndex * (i + 1);
        }

        return ans;
    }

    public int reverseDegree3(String s) {
        return IntStream.range(0, s.length())
                .map(i -> (26 - (s.charAt(i) - 'a')) * (i + 1))
                .sum();
    }
}
