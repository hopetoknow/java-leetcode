package com.hopetoknow._2828_check_if_a_string_is_an_acronym_of_words;

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
}
