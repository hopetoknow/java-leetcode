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
}
