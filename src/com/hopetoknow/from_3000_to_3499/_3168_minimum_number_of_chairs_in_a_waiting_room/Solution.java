package com.hopetoknow.from_3000_to_3499._3168_minimum_number_of_chairs_in_a_waiting_room;

class Solution {
    public int minimumChairs(String s) {
        int currentChairs = 0;
        int minChairs = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'E') {
                currentChairs++;
                minChairs = Math.max(currentChairs, minChairs);
            } else {
                currentChairs--;
            }
        }

        return minChairs;
    }
}
