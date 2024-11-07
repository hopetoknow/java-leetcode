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

    public int minBitFlips2(int start, int goal) {
        return Integer.bitCount(start ^ goal);
    }

    public int minBitFlips3(int start, int goal) {
        int ans = 0;

        while (start != 0 || goal != 0) {
            if ((start & 1) != (goal & 1)) {
                ans++;
            }

            start >>= 1;
            goal >>= 1;
        }

        return ans;
    }

    public int minBitFlips4(int start, int goal) {
        int ans = 0;
        int diff = start ^ goal;

        while (diff != 0) {
            diff &= diff - 1;
            ans++;
        }

        return ans;
    }
}
