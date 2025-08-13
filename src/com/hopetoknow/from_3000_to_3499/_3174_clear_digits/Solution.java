package com.hopetoknow.from_3000_to_3499._3174_clear_digits;

import java.util.ArrayDeque;
import java.util.Deque;

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

    public String clearDigits3(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }

    public String clearDigits4(String s) {
        char[] charArray = new char[s.length()];
        int index = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                index--;
            } else {
                charArray[index++] = ch;
            }
        }

        return new String(charArray, 0 , index);
    }
}
