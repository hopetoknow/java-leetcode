package com.hopetoknow._0013_roman_to_integer;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        int result = 0, number = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
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

    public int romanToInt2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int answer = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                answer -= map.get(s.charAt(i));
            } else {
                answer += map.get(s.charAt(i));
            }
        }

        return answer + map.get(s.charAt(s.length() - 1));
    }
}
