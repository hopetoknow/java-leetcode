package com.hopetoknow.from_3500_to_3999._3794_reverse_string_prefix;

class Solution {
    public String reversePrefix(String s, int k) {
        return new StringBuilder()
                .append(s, 0, k)
                .reverse()
                .append(s.substring(k))
                .toString();
    }
}
