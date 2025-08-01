package com.hopetoknow.from_2000_to_2499._2351_first_letter_to_appear_twice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public char repeatedCharacter(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            if (freq.get(ch) == 2) {
                return ch;
            }
        }

        return 'a';
    }

    public char repeatedCharacter2(String s) {
        Set<Character> seen = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (!seen.add(ch)) {
                return ch;
            }
        }

        return 'a';
    }

    public char repeatedCharacter3(String s) {
        boolean[] seen = new boolean[26];

        for (char ch : s.toCharArray()) {
            int index = ch - 'a';

            if (seen[index]) {
                return ch;
            }

            seen[index] = true;
        }

        return 'a';
    }

    public char repeatedCharacter4(String s) {
        int seen = 0;

        for (char ch : s.toCharArray()) {
            int bit = 1 << (ch - 'a');

            if ((seen & bit) != 0) {
                return ch;
            }

            seen |= bit;
        }

        return 'a';
    }

    public char repeatedCharacter5(String s) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            int index = ch - 'a';

            if (++freq[index] == 2) {
                return ch;
            }
        }

        return 'a';
    }

    public char repeatedCharacter6(String s) {
        int seen = 0;

        for (int i = 0;; i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';

            if ((seen >> index & 1) == 1) {
                return ch;
            }

            seen |= 1 << index;
        }
    }

    public char repeatedCharacter7(String s) {
        Set<Character> seen = new HashSet<>();

        return s.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> !seen.add(ch))
                .findFirst()
                .orElse('a');
    }
}
