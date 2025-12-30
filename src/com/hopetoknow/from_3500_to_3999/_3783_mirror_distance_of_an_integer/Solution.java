package com.hopetoknow.from_3500_to_3999._3783_mirror_distance_of_an_integer;

class Solution {
    public int mirrorDistance(int n) {
        int num = n;
        int reversed = 0;

        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        return Math.abs(n - reversed);
    }
}
