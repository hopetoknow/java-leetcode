package com.hopetoknow.from_3500_to_3999._3794_reverse_string_prefix;

class Solution {
    public String reversePrefix(String s, int k) {
        return new StringBuilder()
                .append(s, 0, k)
                .reverse()
                .append(s, k, s.length())
                .toString();
    }

    public String reversePrefix2(String s, int k) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < k / 2; i++) {
             char temp = chars[i];
             chars[i] = chars[k - 1 - i];
             chars[k - 1 - i] = temp;
        }

        return new String(chars);
    }
}
