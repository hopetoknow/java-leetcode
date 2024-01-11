package com.hopetoknow._2520_count_the_digits_that_divide_a_number;

class Solution {
    public int countDigits(int num) {
        int vals = num;
        int counter = 0;

        while (vals > 0) {
            if (num % (vals % 10) == 0) {
                counter++;
            }
            vals /= 10;
        }

        return counter;
    }
}
