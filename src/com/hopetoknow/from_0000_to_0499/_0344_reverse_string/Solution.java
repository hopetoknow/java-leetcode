package com.hopetoknow.from_0000_to_0499._0344_reverse_string;

class Solution {
    public void reverseString(char[] s) {
        int n = s.length;

        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;
        }
    }

    public void reverseString2(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}