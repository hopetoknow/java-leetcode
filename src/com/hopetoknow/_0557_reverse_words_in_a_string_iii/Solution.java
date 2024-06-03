package com.hopetoknow._0557_reverse_words_in_a_string_iii;

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
}
