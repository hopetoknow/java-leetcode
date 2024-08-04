package com.hopetoknow.from_0500_to_0999._0557_reverse_words_in_a_string_iii;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }

        return String.join(" ", words);
    }

    public String reverseWords2(String s) {
        StringBuilder ans = new StringBuilder();

        for (String word : s.split(" ")) {
            ans.append(new StringBuilder(word).reverse()).append(" ");
        }

        return ans.toString().trim();
    }

    public String reverseWords3(String s) {
        StringBuilder ans = new StringBuilder();

        for (String word : s.split(" ")) {
            for (int i = word.length() - 1; i >= 0; i--) {
                ans.append(word.charAt(i));
            }

            ans.append(" ");
        }

        return ans.substring(0, ans.length() - 1);
    }

    public String reverseWords4(String s) {
        return Arrays.stream(s.split(" "))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }
}
