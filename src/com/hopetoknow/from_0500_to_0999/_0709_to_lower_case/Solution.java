package com.hopetoknow.from_0500_to_0999._0709_to_lower_case;

class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public String toLowerCase2(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] - 'A' + 'a');
            }
        }

        return new String(chars);
    }

    public String toLowerCase3(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] |= 32;
            }
        }

        return new String(chars);
    }

    public String toLowerCase4(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                chars[i] += 32;
            }
        }

        return new String(chars);
    }
}
