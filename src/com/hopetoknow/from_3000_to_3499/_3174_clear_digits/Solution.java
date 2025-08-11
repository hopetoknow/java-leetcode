package com.hopetoknow.from_3000_to_3499._3174_clear_digits;

class Solution {
    public String clearDigits(String s) {
        if (s.length() == 1) {
            return s;
        }

        StringBuilder result = new StringBuilder().append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar >= '0' && currentChar <= '9') {
                result.setLength(result.length() - 1);
            } else {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    public String clearDigits2(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (Character.isDigit(currentChar)) {
                result.setLength(result.length() - 1);
            } else {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
