package com.hopetoknow._1816_truncate_sentence;

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
}
