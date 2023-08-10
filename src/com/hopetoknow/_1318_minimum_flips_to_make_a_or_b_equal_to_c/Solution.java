package com.hopetoknow._1318_minimum_flips_to_make_a_or_b_equal_to_c;

class Solution {
    public int minFlips(int a, int b, int c) {
        int flipCounter = 0;

        while (a > 0 || b > 0 || c > 0) {
            if ((c & 1) == 1) {
                if ((a & 1) == 0 && (b & 1) == 0) {
                    flipCounter++;
                }
            } else {
                flipCounter += (a & 1) + (b & 1);
            }

            a >>= 1;
            b >>= 1;
            c >>= 1;
        }

        return flipCounter;
    }
}
