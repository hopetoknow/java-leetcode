package com.hopetoknow.from_3000_to_3499._3304_find_the_kth_character_in_string_game_i;

class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");

        while (word.length() < k) {
            int n = word.length();

            for (int i = 0; i < n; i++) {
                char newChar = (char)(word.charAt(i) + 1);

                if (newChar > 'z') {
                    newChar -= 26;
                }

                word.append(newChar);
            }
        }

        return word.charAt(k - 1);
    }
}
