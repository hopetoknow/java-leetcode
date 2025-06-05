package com.hopetoknow.from_2500_to_2999._2553_separate_the_digits_in_an_array;

class Solution {
    public int[] separateDigits(int[] nums) {
        int n = 0;

        for (int num : nums) {
            n += countDigits(num);
        }

        int[] answer = new int[n];
        int index = 0;

        for (int num : nums) {
            int digitsCount = countDigits(num);
            int[] digits = new int[digitsCount];
            int i = digitsCount - 1;

            while (num > 0) {
                digits[i--] = num % 10;
                num /= 10;
            }

            for (int digit : digits) {
                answer[index++] = digit;
            }
        }

        return answer;
    }

    private int countDigits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }
}
