package com.hopetoknow.from_0500_to_0999._0744_find_smallest_letter_greater_than_target;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char letter : letters) {
            if (letter > target) {
                return letter;
            }
        }

        return letters[0];
    }

    public char nextGreatestLetter2(char[] letters, char target) {
        int length = letters.length;
        int left = 0;
        int right = length - 1;

        while (left <= right) {
            int mid = (left + right) >> 1;

            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return letters[left % length];
    }
}
