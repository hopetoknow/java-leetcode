package com.hopetoknow._1672_richest_customer_wealth;

import java.util.Arrays;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximumWealth = Integer.MIN_VALUE;
        int wealth;

        for (int[] account : accounts) {
            wealth = 0;
            for (int moneyAmountInBank : account) {
                wealth += moneyAmountInBank;
            }

            if (wealth > maximumWealth) {
                maximumWealth = wealth;
            }
        }

        return maximumWealth;
    }

    public int maximumWealth2(int[][] accounts) {
        return Arrays.stream(accounts)
                .mapToInt(account -> Arrays.stream(account).sum())
                .max()
                .orElse(0);
    }
}
