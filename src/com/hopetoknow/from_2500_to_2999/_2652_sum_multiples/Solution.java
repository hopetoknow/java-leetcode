package com.hopetoknow.from_2500_to_2999._2652_sum_multiples;

class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;

        for (int i = 3; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public int sumOfMultiples2(int n) {
        return sum(n, 3) + sum(n, 5) + sum(n, 7) - sum(n, 15) - sum(n, 21) - sum(n, 35) + sum(n, 105);
    }

    private int sum(int n, int first) {
        int last = n / first * first;
        int count = last / first;
        return (first + last) * count / 2;
    }

    private int sum2(int n, int first) {
        return first * (1 + n / first) * (n / first) / 2;
    }
}
