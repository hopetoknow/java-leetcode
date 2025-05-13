package com.hopetoknow.from_3500_to_3999._3541_find_most_frequent_vowel_and_consonant;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> letterFreq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            letterFreq.put(ch, letterFreq.getOrDefault(ch, 0) + 1);
        }

        int maxVowelFreq = 0;
        int maxConsonantFreq = 0;

        for (Map.Entry<Character, Integer> entry : letterFreq.entrySet()) {
            char ch = entry.getKey();
            int freq = entry.getValue();

            if (isVowel(ch)) {
                maxVowelFreq = Math.max(maxVowelFreq, freq);
            } else {
                maxConsonantFreq = Math.max(maxConsonantFreq, freq);
            }
        }

        return maxVowelFreq + maxConsonantFreq;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
