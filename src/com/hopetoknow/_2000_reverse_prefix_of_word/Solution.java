package com.hopetoknow._2000_reverse_prefix_of_word;

class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int n = word.length();

        for (int i = 0; i < n; i++) {
            char letter = word.charAt(i);
            sb.append(letter);

            if (letter == ch) {
                sb.reverse();
                sb.append(word, i + 1, n);
                break;
            }
        }

        return sb.toString();
    }
}
