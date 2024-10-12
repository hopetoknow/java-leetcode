package com.hopetoknow.from_2500_to_2999._2696_minimum_string_length_after_removing_substrings;

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
}
