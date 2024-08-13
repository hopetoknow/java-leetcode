package com.hopetoknow.from_2500_to_2999._2828_check_if_a_string_is_an_acronym_of_words;

import java.util.List;

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n = words.size();

        if (n != s.length()) {
            return false;
        }

        for (int i = 0; i < n; i++) {
            if (words.get(i).charAt(0) != s.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean isAcronym2(List<String> words, String s) {
        if (words.size() != s.length()) {
            return false;
        }

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word.charAt(0));
        }

        return sb.toString().equals(s);
    }
}
