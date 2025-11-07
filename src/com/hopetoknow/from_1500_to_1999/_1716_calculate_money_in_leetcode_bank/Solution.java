package com.hopetoknow.from_1500_to_1999._1716_calculate_money_in_leetcode_bank;

class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int current = 1;
        int mondayMoney  = 1;

        for (int day = 1; day <= n; day++) {
            total += current++;

            if (day % 7 == 0) {
                current = ++mondayMoney;
            }
        }

        return total;
    }

    public int totalMoney2(int n) {
        int total = 0;
        int mondayMoney  = 1;

        while (n > 0) {
            for (int day = 0; day < Math.min(7, n); day++) {
                total += mondayMoney + day;
            }

            n -= 7;
            mondayMoney++;
        }

        return total;
    }
}
