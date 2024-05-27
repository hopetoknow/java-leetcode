package com.hopetoknow._2864_maximum_odd_binary_number;

class Solution {
    public static String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (count > 1) {
                sb.append("1");
                count--;
            } else {
                sb.append("0");
            }
        }

        sb.append("1");

        return sb.toString();
    }

    public String maximumOddBinaryNumber2(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }

        return "1".repeat(count - 1) + "0".repeat(s.length() - count) + "1";
    }
}
