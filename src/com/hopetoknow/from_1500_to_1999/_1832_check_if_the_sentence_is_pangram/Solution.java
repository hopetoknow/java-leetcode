package com.hopetoknow.from_1500_to_1999._1832_check_if_the_sentence_is_pangram;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet();

        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }

        return set.size() == 26;
    }

    public boolean checkIfPangram2(String sentence) {
        int[] abc = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            abc[sentence.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (abc[i] == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean checkIfPangram3(String sentence) {
        boolean[] abc = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            abc[sentence.charAt(i) - 'a'] = true;
        }

        for (boolean b : abc) {
            if (!b) {
                return false;
            }
        }

        return true;
    }

    public boolean checkIfPangram4(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }

        String abc = "abcdefghijklmnopqrstuvwxyz";

        for (char ch : abc.toCharArray()) {
            if (sentence.indexOf(ch) == -1) {
                return false;
            }
        }

        return true;
    }
}
