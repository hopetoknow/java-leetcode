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

    public boolean isCircularSentence2(String sentence) {
        String[] words = sentence.split(" ");
        int n = words.length;

        for (int i = 0; i < n; i++) {
            String word = words[i];

            if (word.charAt(word.length() - 1) != words[(i + 1) % n].charAt(0)) {
                return false;
            }
        }

        return true;
    }

    public boolean isCircularSentence3(String sentence) {
        int n = sentence.length();

        for (int i = 1; i < n; i++) {
            if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) != sentence.charAt(i + 1)) {
                return false;
            }
        }

        return sentence.charAt(0) == sentence.charAt(n - 1);
    }
}
