package com.hopetoknow._2114_maximum_number_of_words_found_in_sentences;

import java.util.Arrays;

class Solution {
    public int mostWordsFound(String[] sentences) {
        return Arrays.stream(sentences)
                .mapToInt(sentence -> sentence.split(" ").length)
                .max()
                .getAsInt();
    }

    public int mostWordsFound2(String[] sentences) {
        int ans = 0;

        for (String sentence : sentences) {
            int count = 1;

            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    count++;
                }
            }

            ans = Math.max(ans, count);
        }

        return ans;
    }
}
