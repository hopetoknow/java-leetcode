package com.hopetoknow.from_1500_to_1999._1652_defuse_the_bomb;

class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];

        if (k == 0) {
            return ans;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < Math.abs(k); j++) {
                if (k > 0) {
                    ans[i] += code[(i + 1 + j) % n];
                } else {
                    ans[i] += code[(i - 1 + n - j) % n];
                }
            }
        }

        return ans;
    }
}
