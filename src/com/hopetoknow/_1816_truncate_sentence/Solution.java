package com.hopetoknow._1816_truncate_sentence;

import java.util.Arrays;

class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");

        for (int i = 0; i < k - 1; i++) {
            sb.append(words[i]).append(" ");
        }

        sb.append(words[k-1]);

        return sb.toString();
    }

    public String truncateSentence2(String s, int k) {
        return String.join(" ", Arrays.copyOf(s.split(" "), k));
    }

    public String truncateSentence3(String s, int k) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && (--k) == 0) {
                return s.substring(0, i);
            }
        }

        return s;
    }
}
