package com.hopetoknow.from_3000_to_3499._3174_clear_digits;

class Solution {
    public String clearDigits(String s) {
        if (s.length() == 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder().append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char currChar = s.charAt(i);

            if (currChar >= '0' && currChar <= '9') {
                sb.setLength(sb.length() - 1);
            } else {
                sb.append(currChar);
            }
        }

        return sb.toString();
    }
}
