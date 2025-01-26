package com.hopetoknow.from_3000_to_3499._3340_check_balanced_string;

class Solution {
    public boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';

            if ((i & 1) == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }

        return evenSum == oddSum;
    }

    public boolean isBalanced2(String num) {
        int[] sums = new int[2];

        for (int i = 0; i < num.length(); ++i) {
            sums[i & 1] += num.charAt(i) - '0';
        }

        return sums[0] == sums[1];
    }

    public boolean isBalanced3(String num) {
        int diff = 0;
        int sign = 1;

        for (int i = 0; i < num.length(); ++i) {
            diff += sign * (num.charAt(i) - '0');
            sign = -sign;
        }

        return diff == 0;
    }
}
