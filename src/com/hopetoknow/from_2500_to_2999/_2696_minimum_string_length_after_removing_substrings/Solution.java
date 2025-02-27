package com.hopetoknow.from_2500_to_2999._2696_minimum_string_length_after_removing_substrings;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && ((ch == 'B' && stack.peek() == 'A') || (ch == 'D' && stack.peek() == 'C'))) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        return stack.size();
    }

    public int minLength2(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        stack.push(' ');

        for (char ch : s.toCharArray()) {
            if ((ch == 'B' && stack.peek() == 'A') || (ch == 'D' && stack.peek() == 'C')) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        return stack.size() - 1;
    }

    public int minLength3(String s) {
        while (s.contains("AB") || s.contains("CD")) {
            s = s.replace("AB", "").replace("CD", "");
        }

        return s.length();
    }

    public int minLength4(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (!sb.isEmpty()
                    && ((sb.charAt(sb.length() - 1) == 'A' && ch == 'B')
                    || (sb.charAt(sb.length() - 1) == 'C' && ch == 'D'))) {
                sb.setLength(sb.length() - 1);
            } else {
                sb.append(ch);
            }
        }

        return sb.length();
    }

    public int minLength5(String s) {
        char[] chars = new char[s.length()];
        int index = 0;

        for (char ch : s.toCharArray()) {
            if (index > 0 && ((chars[index - 1] == 'A' && ch == 'B') || (chars[index - 1] == 'C' && ch == 'D'))) {
                index--;
            } else {
                chars[index++] = ch;
            }
        }

        return index;
    }

    public int minLength6(String s) {
        char[] chars = s.toCharArray();
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            chars[index] = chars[i];

            if (index > 0
                    && (chars[index - 1] == 'A' || chars[index - 1] == 'C')
                    && chars[index] == chars[index - 1] + 1) {
                index--;
            } else {
                index++;
            }
        }

        return index;
    }
}
