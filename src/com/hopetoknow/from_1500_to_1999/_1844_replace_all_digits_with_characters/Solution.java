package com.hopetoknow.from_1500_to_1999._1844_replace_all_digits_with_characters;

class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i += 2) {
            sb.append(s.charAt(i));

            if (i + 1 < s.length()) {
                sb.append((char) (s.charAt(i) + (s.charAt(i + 1) - '0')));
            }
        }

        return sb.toString();
    }
}