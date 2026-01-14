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

        return binary.reverse().toString();
    }
}
