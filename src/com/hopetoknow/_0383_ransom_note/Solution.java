package com.hopetoknow._0383_ransom_note;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineLetters = new HashMap<>();

        for (char letter : magazine.toCharArray()) {
            magazineLetters.put(letter, magazineLetters.getOrDefault(letter, 0) + 1);
        }

        for (char letter : ransomNote.toCharArray()) {
            if (magazineLetters.containsKey(letter)) {
                int letterFrequency = magazineLetters.get(letter);

                if (letterFrequency > 1) {
                    magazineLetters.put(letter, letterFrequency - 1);
                } else {
                    magazineLetters.remove(letter);
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        int[] alphabet = new int[26];

        for (char letter : magazine.toCharArray()) {
            alphabet[letter - 'a']++;
        }

        for (char letter : ransomNote.toCharArray()) {
            if (--alphabet[letter - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
