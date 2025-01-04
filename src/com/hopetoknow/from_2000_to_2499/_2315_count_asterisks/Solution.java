package com.hopetoknow.from_2000_to_2499._2315_count_asterisks;

class Solution {
    public int countAsterisks(String s) {
        String[] parts = s.split("\\|");
        int ans = 0;

        for (int i = 0; i < parts.length; i+= 2) {
            for (char ch : parts[i].toCharArray()) {
                if (ch == '*') {
                    ans++;
                }
            }
        }

        return ans;
    }
}

