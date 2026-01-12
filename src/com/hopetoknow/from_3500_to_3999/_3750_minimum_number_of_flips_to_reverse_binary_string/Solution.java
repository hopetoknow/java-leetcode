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
}
