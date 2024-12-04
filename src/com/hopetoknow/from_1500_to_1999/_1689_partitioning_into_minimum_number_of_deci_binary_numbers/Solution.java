package com.hopetoknow.from_1500_to_1999._1689_partitioning_into_minimum_number_of_deci_binary_numbers;

class Solution {
    public int minPartitions(String n) {
        int max = 1;

        for (char ch : n.toCharArray()) {
            max = Math.max(max, ch - '0');

            if (max == 9) {
                return max;
            }
        }

        return max;
    }
}
