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

    public void reverseString3(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            s[i] ^= s[j];
            s[j] ^= s[i];
            s[i] ^= s[j];
        }
    }

    public void reverseString4(char[] s) {
        reverse(s, 0, s.length - 1);
    }

    private void reverse(char[] s, int i, int j) {
        if (i >= j) {
            return;
        }

        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        reverse(s, i + 1, j - 1);
    }
}
