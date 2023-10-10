package com.hopetoknow._0744_find_smallest_letter_greater_than_target;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char letter : letters) {
            if (letter > target) {
                return letter;
            }
        }

        return letters[0];
    }
}
