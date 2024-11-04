package com.hopetoknow.from_2000_to_2499._2220_minimum_bit_flips_to_convert_number;

class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = 0;
        int diff = start ^ goal;

        while (diff != 0) {
            ans += diff & 1;
            diff >>= 1;
        }

        return ans;
    }
}
