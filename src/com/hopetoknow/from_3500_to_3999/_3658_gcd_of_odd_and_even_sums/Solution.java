package com.hopetoknow.from_3500_to_3999._3658_gcd_of_odd_and_even_sums;

class Solution {
    public int gcdOfOddEvenSums(int n) {
        return n;
    }

    public int gcdOfOddEvenSums2(int n) {
        int sumOdd = n * n;
        int sumEven = n * (n + 1);
        return n * gcd2(n, n + 1);
    }

    private int gcd2(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd2(b, a % b);
    }

    public int gcdOfOddEvenSums3(int n) {
        int sumOdd = n * n;
        int sumEven = n * (n + 1);
        return gcd3(sumOdd, sumEven);
    }

    private int gcd3(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
