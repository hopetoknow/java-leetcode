package com.hopetoknow.from_2000_to_2499._2185_counting_words_with_a_given_prefix;

class Solution {
    public int prefixCount(String[] words, String pref) {
        int n = pref.length();
        int ans = 0;

        for (String word : words) {
            if (word.length() >= n && word.substring(0, n).equals(pref)) {
                ans++;
            }
        }

        return ans;
    }

    public int prefixCount2(String[] words, String pref) {
        int ans = 0;

        for (String word : words) {
            if (word.startsWith(pref)) {
                ans++;
            }
        }

        return ans;
    }
}
