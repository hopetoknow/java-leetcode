package com.hopetoknow.from_1500_to_1999._1614_maximum_nesting_depth_of_the_parentheses;

class Solution {
    public int maxDepth(String s) {
        int currentDepth = 0;
        int maxDepth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (ch == ')') {
                currentDepth--;
            }
        }

        return maxDepth;
    }
}
