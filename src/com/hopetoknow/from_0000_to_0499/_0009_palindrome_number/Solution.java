package com.hopetoknow.from_0000_to_0499._0009_palindrome_number;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String str = Integer.toString(x);
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }

        return true;
    }
}
