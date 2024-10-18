package com.hopetoknow.from_3000_to_3499._3099_harshad_number;

class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int num = x;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return x % sum == 0 ? sum : -1;
    }
}
