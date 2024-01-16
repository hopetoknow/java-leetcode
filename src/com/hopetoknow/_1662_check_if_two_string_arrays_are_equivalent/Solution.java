package com.hopetoknow._1662_check_if_two_string_arrays_are_equivalent;

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
}
