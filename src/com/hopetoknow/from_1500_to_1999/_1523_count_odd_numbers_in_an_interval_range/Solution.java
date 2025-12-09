package com.hopetoknow.from_1500_to_1999._1523_count_odd_numbers_in_an_interval_range;

class Solution {
    public int countOdds(int low, int high) {
        int count = 0;

        for (int i = low; i <= high; i++) {
            if ((i & 1) == 1) {
                count++;
            }
        }

        return count;
    }
}
