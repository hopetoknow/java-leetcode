package com.hopetoknow.from_1000_to_1499._1437_check_if_all_1s_are_at_least_length_k_places_away;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                indexes.add(i);
            }
        }

        int n = indexes.size();

        if (n == 0) {
            return true;
        }

        int prev = indexes.get(0);

        for (int i = 1; i < n; i++) {
            if (indexes.get(i) - prev - 1 < k) {
                return false;
            }

            prev = indexes.get(i);
        }

        return true;
    }

    public boolean kLengthApart2(int[] nums, int k) {
        int n = nums.length;
        int prev = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                prev = i;
                break;
            }
        }

        for (int i = prev + 1; i < n; i++) {
            if (nums[i] == 1) {
                if (i - prev - 1 < k) {
                    return false;
                }

                prev = i;
            }
        }

        return true;
    }
}
