package com.hopetoknow.from_2000_to_2499._2108_find_first_palindromic_string_in_the_array;

class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            int n = word.length();
            boolean isPalindrome = true;

            for (int i = 0; i < n / 2; i++) {
                if (word.charAt(i) != word.charAt(n - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                return word;
            }
        }

        return "";
    }

    public String firstPalindrome2(String[] words) {
        for (String word : words) {
            if (new StringBuilder(word).reverse().toString().equals(word)) {
                return word;
            }
        }

        return "";
    }

    public String firstPalindrome3(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }

        return "";
    }

    private boolean isPalindrome(String word) {
        int n = word.length();

        for (int i = 0; i < n / 2; i++) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
