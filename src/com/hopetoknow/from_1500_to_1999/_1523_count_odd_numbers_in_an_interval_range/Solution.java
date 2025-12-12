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

    public int countOdds2(int low, int high) {
        int delta = (high - low) / 2;

        if ((low & 1) == 1 || (high & 1) == 1) {
            delta ++;
        }

        return delta;
    }

    public int countOdds3(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }

    public int countOdds4(int low, int high) {
        return ((high + 1) >> 1) - (low >> 1);
    }
}
