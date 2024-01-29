package com.hopetoknow._1486_xor_operation_in_an_array;

class Solution {
    public int xorOperation(int n, int start) {
        int ans = start;

        for (int i = 1; i < n; i++) {
            ans ^= start + 2 * i;
        }

        return ans;
    }
}
