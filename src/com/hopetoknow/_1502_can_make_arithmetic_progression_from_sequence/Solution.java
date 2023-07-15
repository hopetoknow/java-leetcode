package com.hopetoknow._1502_can_make_arithmetic_progression_from_sequence;

class Solution {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int delta = arr[1] - arr[0];

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != delta) {
                return false;
            }
        }

        return true;
    }
}