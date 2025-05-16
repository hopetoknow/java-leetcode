package com.hopetoknow.from_3000_to_3499._3019_number_of_changing_keys;

class Solution {
    public int countKeyChanges(String s) {
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(i - 1))) {
                count++;
            }
        }

        return count;
    }
}
