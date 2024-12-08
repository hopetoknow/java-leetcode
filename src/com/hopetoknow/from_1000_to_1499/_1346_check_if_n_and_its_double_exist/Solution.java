package com.hopetoknow.from_1000_to_1499._1346_check_if_n_and_its_double_exist;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean checkIfExist2(int[] arr) {
        Set<Integer> checked = new HashSet<>();

        for (int num : arr) {
            if (checked.contains(num * 2) || (num % 2 == 0 && checked.contains(num / 2))) {
                return true;
            }

            checked.add(num);
        }

        return false;
    }
}
