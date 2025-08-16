package com.hopetoknow.from_2500_to_2999._2843_count_symmetric_integers;

class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        while (low <= high) {
            if (isSymmetric(low)) {
                count++;
            }

            low++;
        }

        return count;
    }

    private boolean isSymmetric(int num) {
        String numAsString = String.valueOf(num);
        int n = numAsString.length();

        if (n % 2 != 0) {
            return false;
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n / 2; i++) {
            sum1 += numAsString.charAt(i) - '0';
            sum2 += numAsString.charAt(n - 1 - i) - '0';
        }

        return sum1 == sum2;
    }

    public int countSymmetricIntegers2(int low, int high) {
        int count = 0;

        for (int num = low; num <= high; num++) {
            int length = (int)Math.log10(num) + 1;

            if (length % 2 != 0) {
                continue;
            }

            int half = length / 2;
            int pow = (int) Math.pow(10, half);

            int left = num / pow;
            int right = num % pow;

            if (sumOfDigits(left) == sumOfDigits(right)) {
                count++;
            }
        }

        return count;
    }

    private int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
