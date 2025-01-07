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

    public int countAsterisks2(String s) {
        int asteriskCount = 0;
        int barCount = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '|') {
                barCount++;
            } else if (ch == '*' && barCount % 2 == 0) {
                asteriskCount++;
            }
        }

        return asteriskCount;
    }

    public int countAsterisks3(String s) {
        int ans = 0;
        boolean outsideBars = true;

        for (char ch : s.toCharArray()) {
            if (ch == '|') {
                outsideBars = !outsideBars;
            }
            else if (ch == '*' && outsideBars) {
                ans++;
            }
        }

        return ans;
    }

    public int countAsterisks4(String s) {
        int ans = 0;
        int isOutsideBars = 1;

        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                ans += isOutsideBars;
            } else if (ch == '|') {
                isOutsideBars ^= 1;
            }
        }

        return ans;
    }
}
