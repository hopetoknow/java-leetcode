package com.hopetoknow.easy._744_find_smallest_letter_greater_than_target;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int index = 0;

        int prevDelta = letters[0] - target >= 1 ? letters[0] - target : Integer.MAX_VALUE;
        int delta;

        for (int i = 1; i < letters.length; i++) {
            delta = letters[i] - target;
            if (letters[i] - target >= 1 && delta < prevDelta) {
                prevDelta = delta;
                index = i;
            }
        }

        return letters[index];
    }
}
