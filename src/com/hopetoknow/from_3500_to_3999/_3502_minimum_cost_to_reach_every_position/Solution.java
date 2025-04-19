package com.hopetoknow.from_3500_to_3999._3502_minimum_cost_to_reach_every_position;

class Solution {
    public int[] minCosts(int[] cost) {
        int n = cost.length;
        int[] ans = new int[n];
        int min = 100;

        for (int i = 0; i < n; i++) {
            if (cost[i] < min) {
                min = cost[i];
            }

            ans[i] = min;
        }

        return ans;
    }
}
