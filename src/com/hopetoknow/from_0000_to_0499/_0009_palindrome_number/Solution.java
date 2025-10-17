package com.hopetoknow.from_0000_to_0499._0009_palindrome_number;

import java.util.ArrayList;
import java.util.List;

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

    public boolean isPalindrome2(int x) {
        if (x < 0) {
            return false;
        }

        List<Integer> digits = new ArrayList<>();

        while (x > 0) {
            digits.add(x % 10);
            x /= 10;
        }

        int left = 0, right = digits.size() - 1;

        while (left < right) {
            if (digits.get(left++) != digits.get(right--)) {
                return false;
            }
        }

        return true;
    }
}
