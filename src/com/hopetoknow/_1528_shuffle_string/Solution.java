package com.hopetoknow._1528_shuffle_string;

class Solution {
    public String restoreString(String s, int[] indices) {
        int length = indices.length;
        char[] answer = new char[length];

        for (int i = 0; i < length; i++) {
            answer[indices[i]] = s.charAt(i);
        }

        return new String(answer);
    }
}
