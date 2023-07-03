package com.hopetoknow.easy._383_ransom_note;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        String[] magazineLetters = magazine.split("");
        String[] ransomNoteLetters = ransomNote.split("");

        List<String> magazineLettersAsList = new ArrayList<>(Arrays.asList(magazineLetters));

        for (int i = 0; i < ransomNote.length(); i++) {
            String ransomNoteLetter = ransomNoteLetters[i];

            if (magazineLettersAsList.contains(ransomNoteLetter)) {
                magazineLettersAsList.remove(ransomNoteLetter);
            } else {
                return false;
            }
        }

        return true;
    }
}

