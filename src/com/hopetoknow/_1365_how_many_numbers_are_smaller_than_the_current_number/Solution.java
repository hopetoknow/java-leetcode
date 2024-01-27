package com.hopetoknow._1365_how_many_numbers_are_smaller_than_the_current_number;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }

            ans[i] = count;
        }

        return ans;
    }

    public int[] smallerNumbersThanCurrent2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = nums.clone();
        int n = nums.length;

        Arrays.sort(ans);

        for (int i = 0; i < n; i++) {
            map.putIfAbsent(ans[i], i);
        }

        for (int i = 0; i < n; i++) {
            ans[i] = map.get(nums[i]);
        }

        return ans;
    }

    public int[] smallerNumbersThanCurrent3(int[] nums) {
        int[] ans = nums.clone();
        int n = nums.length;

        Arrays.sort(ans);

        for (int i = 0; i < n; i++) {
            nums[i] = search(ans, nums[i]);
        }

        return nums;
    }

    private int search(int[] arr, int num) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int index = (left + right) >> 1;

            if (arr[index] >= num) {
                right = index;
            } else {
                left = index + 1;
            }
        }

        return left;
    }
}
