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

    public int mirrorDistance2(int n) {
        return Math.abs(n - reverse(n));
    }

    private int reverse(int num) {
        int reversed = 0;

        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        return reversed;
    }

    public int mirrorDistance3(int n) {
        String str = String.valueOf(n);
        String reversedStr = new StringBuilder(str).reverse().toString();
        int reversed = Integer.parseInt(reversedStr);

        return Math.abs(n - reversed);
    }
}
