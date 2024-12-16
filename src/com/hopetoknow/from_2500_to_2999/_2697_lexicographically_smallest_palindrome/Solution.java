package com.hopetoknow.from_2500_to_2999._2697_lexicographically_smallest_palindrome;

class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] ans = s.toCharArray();

        for (int i = 0, j = ans.length - 1; i < j; i++, j--) {
            if (ans[i] < ans[j]) {
                ans[j] = ans[i];
            } else if (ans[i] > ans[j]) {
                ans[i] = ans[j];
            }
        }

        return new String(ans);
    }

    public String makeSmallestPalindrome2(String s) {
        char[] ans = s.toCharArray();

        for (int i = 0, j = ans.length - 1; i < j; i++, j--) {
            ans[i] = ans[j] = (char) Math.min(ans[i], ans[j]);
        }

        return new String(ans);
    }
}
