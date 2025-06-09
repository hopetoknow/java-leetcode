package com.hopetoknow.from_2500_to_2999._2553_separate_the_digits_in_an_array;

import java.util.ArrayList;
import java.util.List;

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

    public int[] separateDigits2(int[] nums) {
        List<Integer> digits = new ArrayList<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];

            while (num > 0) {
                digits.add(num % 10);
                num /= 10;
            }
        }

        int n = digits.size();
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = digits.get(n - i - 1);
        }

        return answer;
    }

    public int[] separateDigits3(int[] nums) {
        StringBuilder sb = new StringBuilder();

        for (int num : nums) {
            sb.append(num);
        }

        String digitsAsString = sb.toString();
        int n = digitsAsString.length();
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = digitsAsString.charAt(i) - '0';
        }

        return answer;
    }

    public int[] separateDigits4(int[] nums) {
        int n = 0;

        for (int num : nums) {
            while (num > 0) {
                n++;
                num /= 10;
            }
        }

        int[] answer = new int[n];

        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];

            while (num > 0) {
                answer[--n] = num % 10;
                num /= 10;
            }
        }

        return answer;
    }

    public int[] separateDigits5(int[] nums) {
        int n = 0;

        for (int num : nums) {
            n += (int) Math.log10(num) + 1;
        }

        int[] answer = new int[n];
        int rightIndex = 0;

        for (int num : nums) {
            int digitCount = (int) Math.log10(num) + 1;
            int leftIndex = rightIndex;
            rightIndex += digitCount;

            for (int i = rightIndex - 1; i >= leftIndex; i--) {
                answer[i] = num % 10;
                num /= 10;
            }
        }

        return answer;
    }
}
