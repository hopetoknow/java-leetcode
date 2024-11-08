package com.hopetoknow.from_0000_to_0499._0461_hamming_distance;

class Solution {
    public int hammingDistance(int x, int y) {
        int ans = 0;
        int diff = x ^ y;

        while (diff != 0) {
            ans += diff & 1;
            diff >>= 1;
        }

        return ans;
    }

    public int hammingDistance2(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public int hammingDistance3(int x, int y) {
        int ans = 0;

        while (x != 0 || y != 0) {
            if ((x & 1) != (y & 1)) {
                ans++;
            }

            x >>= 1;
            y >>= 1;
        }

        return ans;
    }

    public int hammingDistance4(int x, int y) {
        int ans = 0;
        int diff = x ^ y;

        while (diff != 0) {
            diff &= diff - 1;
            ans++;
        }

        return ans;
    }
}
