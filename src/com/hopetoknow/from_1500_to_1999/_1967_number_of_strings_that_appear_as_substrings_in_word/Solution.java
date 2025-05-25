package com.hopetoknow.from_1500_to_1999._1967_number_of_strings_that_appear_as_substrings_in_word;

class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                count++;
            }
        }

        return count;
    }
}
