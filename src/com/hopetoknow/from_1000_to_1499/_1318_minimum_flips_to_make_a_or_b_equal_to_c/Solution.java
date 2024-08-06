package com.hopetoknow.from_1000_to_1499._1318_minimum_flips_to_make_a_or_b_equal_to_c;

class Solution {
    public int minFlips(int a, int b, int c) {
        int count = 0;

        while (a > 0 || b > 0 || c > 0) {
            if ((c & 1) == 0) {
                count += (a & 1) + (b & 1);
            } else if ((a & 1) == 0 && (b & 1) == 0) {
                count++;
            }

            a >>= 1;
            b >>= 1;
            c >>= 1;
        }

        return count;
    }

    public int minFlips2(int a, int b, int c) {
        int count = 0;

        for (int i = 0; i < 30; i++) {
            int x = (a >> i) & 1;
            int y = (b >> i) & 1;
            int z = (c >> i) & 1;

            if ((x | y) != z) {
                count += x == 1 && y == 1 ? 2 : 1;
            }
        }

        return count;
    }
}
