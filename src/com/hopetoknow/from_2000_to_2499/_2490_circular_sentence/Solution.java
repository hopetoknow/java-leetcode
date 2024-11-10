package com.hopetoknow.from_2000_to_2499._2490_circular_sentence;

class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        int n = words.length;

        String lastWord = words[n - 1];

        if (lastWord.charAt(lastWord.length() - 1) != words[0].charAt(0)) {
            return false;
        }

        for (int i = 0; i < n - 1; i++) {
            String word = words[i];

            if (word.charAt(word.length() - 1) != words[i + 1].charAt(0)) {
                return false;
            }
        }

        return true;
    }
}
