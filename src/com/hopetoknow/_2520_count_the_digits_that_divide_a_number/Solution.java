package com.hopetoknow._2520_count_the_digits_that_divide_a_number;

class Solution {
    public int countDigits(int num) {
        int vals = num;
        int counter = 0;

        while (vals > 0) {
            if (num % (vals % 10) == 0) {
                counter++;
            }
            vals /= 10;
        }

        return counter;
    }

    public int countDigits2(int num) {
        int count = 0;
        String str = Integer.toString(num);

        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));

            if (num % digit == 0) {
                count++;
            }
        }

        return count;
    }

    public int countDigits3(int num) {
        return (int) Integer.toString(num).chars().filter(c -> num % (c - '0') == 0).count();
    }
}
