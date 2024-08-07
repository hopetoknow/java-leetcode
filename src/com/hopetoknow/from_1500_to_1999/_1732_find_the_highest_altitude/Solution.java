package com.hopetoknow.from_1500_to_1999._1732_find_the_highest_altitude;

class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;

        for(int g : gain) {
            current += g;
            max = Math.max(max, current);
        }

        return max;
    }
}
