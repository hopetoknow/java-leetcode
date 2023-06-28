package com.hopetoknow.easy._13_roman_to_integer;

class Solution {
    public int romanToInt(String s) {
        int length = s.length();
        int result = 0, number = 0;

        for (int i = length - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> number = 1;
                case 'V' -> number = 5;
                case 'X' -> number = 10;
                case 'L' -> number = 50;
                case 'C' -> number = 100;
                case 'D' -> number = 500;
                case 'M' -> number = 1000;
            }

            if (4 * number < result) {
                result -= number;
            } else {
                result += number;
            }
        }

        return result;
    }
}
