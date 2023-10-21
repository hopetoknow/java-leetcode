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
            if (magazineLetters.getOrDefault(letter, 0) > 0) {
                magazineLetters.put(letter, magazineLetters.get(letter) - 1);
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
