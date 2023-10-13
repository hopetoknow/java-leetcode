package com.hopetoknow._1672_richest_customer_wealth;

import java.util.Arrays;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] account : accounts) {
            int wealth = 0;

            for (int money : account) {
                wealth += money;
            }

            maxWealth = Math.max(maxWealth, wealth);
        }

        return maxWealth;
    }

    public int maximumWealth2(int[][] accounts) {
        return Arrays.stream(accounts)
                .mapToInt(account -> Arrays.stream(account).sum())
                .max()
                .orElse(0);
    }
}
