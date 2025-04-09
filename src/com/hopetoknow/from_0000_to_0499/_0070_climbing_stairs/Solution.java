package com.hopetoknow.from_0000_to_0499._0070_climbing_stairs;

class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public int climbStairs2(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        int[] dp = new int[3];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i % 3] = dp[(i - 1) % 3] + dp[(i - 2) % 3];
        }

        return dp[n % 3];
    }

    public int climbStairs3(int n) {
        if (n == 1) {
            return 1;
        }

        int prev = 1;
        int curr = 2;

        for (int i = 3; i <= n; i++) {
            int temp = prev + curr;
            prev = curr;
            curr = temp;
        }

        return curr;
    }
}
