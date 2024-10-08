package com.hopetoknow.from_1500_to_1999._1684_count_the_number_of_consistent_strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();

        for (char ch : allowed.toCharArray()) {
            set.add(ch);
        }

        int ans = 0;

        for (String word : words) {
            boolean valid = true;

            for (char ch : word.toCharArray()) {
                if (!set.contains(ch)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                ans++;
            }
        }

//        int ans = words.length;
//
//        for (String word : words) {
//            for (char ch : word.toCharArray()) {
//                if (!set.contains(ch)) {
//                    ans--;
//                    break;
//                }
//            }
//        }

        return ans;
    }

    public int countConsistentStrings2(String allowed, String[] words) {
        boolean[] abc = new boolean[26];

        for (char ch : allowed.toCharArray()) {
            abc[ch - 'a'] = true;
        }

        int ans = words.length;

        for (String word : words) {
            for (char ch : word.toCharArray()) {
                if (!abc[ch - 'a']) {
                    ans--;
                    break;
                }
            }
        }

        return ans;
    }

    public int countConsistentStrings3(String allowed, String[] words) {
        int allowedBits = 0;

        for (char ch : allowed.toCharArray()) {
            allowedBits |= (1 << ch - 'a');
        }

        int ans = words.length;

        for (String word : words) {
            for (char ch : word.toCharArray()) {
                if ((allowedBits & (1 << ch - 'a')) == 0) {
                    ans--;
                    break;
                }
            }
        }

        return ans;
    }

    public int countConsistentStrings4(String allowed, String[] words) {
        Set<Character> set = allowed.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toSet());

        return (int) Arrays.stream(words)
                .filter(word -> word.chars().allMatch(ch -> set.contains((char) ch)))
                .count();
    }

    public int countConsistentStrings5(String allowed, String[] words) {
        boolean[] abc = new boolean[26];

        allowed.chars().forEach(ch -> abc[ch - 'a'] = true);

        return (int) Arrays.stream(words)
                .filter(word -> word.chars().allMatch(ch -> abc[ch - 'a']))
                .count();
    }

    public int countConsistentStrings6(String allowed, String[] words) {
        int allowedBits = allowed.chars().reduce(0, (bits, ch) -> bits | (1 << ch - 'a'));

        int ans = words.length;

        for (String word : words) {
            if (word.chars().anyMatch(ch -> (allowedBits & (1 << ch - 'a')) == 0)) {
                ans--;
            }
        }

        return ans;
    }
}
