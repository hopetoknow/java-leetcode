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
}
