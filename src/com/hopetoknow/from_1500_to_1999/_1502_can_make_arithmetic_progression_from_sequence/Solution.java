package com.hopetoknow.from_1500_to_1999._1502_can_make_arithmetic_progression_from_sequence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        int diff = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }

        return true;
    }

    public boolean canMakeArithmeticProgression2(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int length = arr.length;

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            min = Math.min(num, min);
            max = Math.max(num, max);
            set.add(num);
        }

        int diff = (max - min) / (length - 1);

        if (diff == 0) {
            return max == min;
        }

        int curr = max - diff;

        while (curr > min) {
            if (!set.contains(curr)) {
                return false;
            }

            curr -= diff;
        }

        return true;
    }
}
