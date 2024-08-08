package com.hopetoknow.from_2000_to_2499._2413_smallest_even_multiple;

class Solution {
    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n * 2;
    }

    public int smallestEvenMultiple2(int n) {
        return n << (n & 1);
    }
}
