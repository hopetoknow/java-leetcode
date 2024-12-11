package com.hopetoknow.from_0500_to_0999._0796_rotate_string;

class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.equals(goal)) {
                return true;
            }

            s = s.substring(1) + s.charAt(0);
        }

        return false;
    }

    public boolean rotateString2(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}