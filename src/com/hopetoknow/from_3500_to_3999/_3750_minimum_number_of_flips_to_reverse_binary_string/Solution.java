package com.hopetoknow.from_3500_to_3999._3750_minimum_number_of_flips_to_reverse_binary_string;

class Solution {
    public int minimumFlips(int n) {
        String binary = Integer.toBinaryString(n);
        String reversed = new StringBuilder(binary).reverse().toString();
        int count = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) != reversed.charAt(i)) {
                count++;
            }
        }

        return count;
    }

    public int minimumFlips2(int n) {
        String binary = Integer.toBinaryString(n);
        int len = binary.length();
        int count = 0;

        for (int i = 0; i < len / 2; i++) {
            if (binary.charAt(i) != binary.charAt(len - 1 - i)) {
                count++;
            }
        }

        return count * 2;
    }

    public int minimumFlips3(int n) {
        String binary = toBinaryString(n);
        int len = binary.length();
        int count = 0;

        for (int i = 0; i < len / 2; i++) {
            if (binary.charAt(i) != binary.charAt(len - 1 - i)) {
                count++;
            }
        }

        return count * 2;
    }

    private String toBinaryString(int n) {
        StringBuilder binary = new StringBuilder();

        while (n > 0) {
            binary.append(n % 2);
            n /= 2;
        }

//        while (n > 0) {
//            binary.append(n & 1);
//            n >>= 1;
//        }

        return binary.reverse().toString();
    }

    public int minimumFlips4(int n) {
        int nCopy = n;
        int left = 0, right = -1, count = 0;

        while (nCopy > 0) {
            nCopy >>= 1;
            right++;
        }

        while (left < right) {
            count += ((n >> left) & 1) ^ ((n >> right) & 1);
            left++;
            right--;
        }

        return count * 2;
    }

    public int minimumFlips5(int n) {
        int[] bits = new int[32];
        int left = 0, right = 0, count = 0;

        while (n > 0) {
            bits[right++] = n & 1;
            n >>= 1;
        }

        while (left < right) {
            count += (bits[left++] ^ bits[--right]);
        }

        return count * 2;
    }
}
