package com.hopetoknow._1662_check_if_two_string_arrays_are_equivalent;

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }

    public boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String s : word1) {
            sb1.append(s);
        }

        for (String s : word2) {
            sb2.append(s);
        }

        return sb1.compareTo(sb2) == 0;
    }

    public boolean arrayStringsAreEqual3(String[] word1, String[] word2) {
        int i = 0, j = 0, x = 0, y = 0;

        while (i < word1.length && j < word2.length) {
            if (word1[i].charAt(x++) != word2[j].charAt(y++)) {
                return false;
            }

            if (x == word1[i].length()) {
                i++;
                x = 0;
            }

            if (y == word2[j].length()) {
                j++;
                y = 0;
            }
        }

        return i == word1.length && j == word2.length;
    }
}
