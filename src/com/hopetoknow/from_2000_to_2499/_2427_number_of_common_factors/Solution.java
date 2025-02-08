package com.hopetoknow.from_2000_to_2499._2427_number_of_common_factors;

class Solution {
    public int commonFactors(int a, int b) {
        int ans = 0;
        int limit = Math.min(a, b);

        for (int i = 1; i <= limit; i++) {
            if (a % i == 0 && b % i == 0) {
                ans++;
            }
        }

        return ans;
    }

    public int commonFactors2(int a, int b) {
        int gcd = gcd(a, b);
        int ans = 0;

        for (int i = 1; i <= gcd; i++) {
            if (gcd % i == 0) {
                ans++;
            }
        }

        return ans;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
