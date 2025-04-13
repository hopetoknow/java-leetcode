package com.hopetoknow.from_0000_to_0499._0070_climbing_stairs;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

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

    public int climbStairs4(int n) {
        if (n <= 3) {
            return n;
        }

        int prev = 3;
        int curr = 5;

        for (int i = 5; i <= n; i++) {
            int temp = prev + curr;
            prev = curr;
            curr = temp;
        }

        return curr;
    }

    public int climbStairs5(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return climbStairs(n, memo);
    }

    private int climbStairs(int n, Map<Integer, Integer> memo) {
        if (n <= 2) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int curr = climbStairs(n - 1, memo) + climbStairs(n - 2, memo);
        memo.put(n, curr);

        return curr;
    }

    public int climbStairs6(int n) {
        int[] memo = new int[n + 1];
        return climbStairs(n, memo);
    }

    private int climbStairs(int n, int[] memo) {
        if (n <= 2) {
            return n;
        }

        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = climbStairs(n - 1, memo) + climbStairs(n - 2, memo);

        return memo[n];
    }

    public int climbStairs7(int n) {
        BigInteger[] memo = new BigInteger[46];
        memo[0] = BigInteger.ONE;
        memo[1] = BigInteger.ONE;

        int ways = 1;

        for (int i = 1; i <= n / 2; i++) {
            int num_1s = n - 2 * i;
            int num_2s = i;
            int total_moves = num_1s + num_2s;

            BigInteger waysForThisCombo = factorial(total_moves, memo)
                    .divide(factorial(num_1s, memo).multiply(factorial(num_2s, memo)));

            ways += waysForThisCombo.intValue();
        }

        return ways;
    }

    private static BigInteger factorial(int n, BigInteger[] memo) {
        if (memo[n] != null) {
            return memo[n];
        }

        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        memo[n] = result;

        return result;
    }
}
