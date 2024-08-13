package com.hopetoknow.from_2500_to_2999._2864_maximum_odd_binary_number;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
    public static String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (count > 1) {
                sb.append("1");
                count--;
            } else {
                sb.append("0");
            }
        }

        sb.append("1");

        return sb.toString();
    }

    public String maximumOddBinaryNumber2(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }

        return "1".repeat(count - 1) + "0".repeat(s.length() - count) + "1";
    }

    public String maximumOddBinaryNumber3(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = 0; i < n / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] == '1') {
                arr[i] = arr[n - 1];
                arr[n - 1] = '1';
                break;
            }
        }

        return new String(arr);
    }

    public String maximumOddBinaryNumber4(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = 0; i < n / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[n - 2 - i];
            arr[n - 2 - i] = temp;
        }

        return new String(arr);
    }

    public String maximumOddBinaryNumber5(String s) {
        return Arrays.stream(s.split(""))
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .collect(Collectors.joining()) + "1";
    }

    public String maximumOddBinaryNumber6(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            if (arr[left] == '1') {
                left++;
            }

            if (arr[right] == '0') {
                right--;
            }

            if (left < right && arr[left] == '0' && arr[right] == '1') {
                arr[left] = '1';
                arr[right] = '0';
            }
        }

        arr[left - 1] = '0';
        arr[n - 1] = '1';

        return new String(arr);
    }
}
