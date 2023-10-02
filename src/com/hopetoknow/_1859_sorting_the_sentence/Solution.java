package com.hopetoknow._1859_sorting_the_sentence;

import java.util.Arrays;

class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");

        Arrays.sort(words, (o1, o2) -> {
            int length1 = o1.length();
            int length2 = o2.length();
            return o1.charAt(length1 - 1) - o2.charAt(length2 - 1);
        });

        for (int i = 0; i < words.length; i++) {
            int length = words[i].length();
            words[i] = words[i].substring(0, length - 1);
        }

        return String.join(" ", words);
    }
}

