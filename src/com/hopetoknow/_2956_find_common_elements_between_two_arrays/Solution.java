package com.hopetoknow._2956_find_common_elements_between_two_arrays;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans1 = 0;
        int ans2 = 0;

        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2) {
                    ans1++;
                    break;
                }
            }
        }

        for (int num2 : nums2) {
            for (int num1 : nums1) {
                if (num2 == num1) {
                    ans2++;
                    break;
                }
            }
        }

        return new int[]{ans1, ans2};
    }

    public int[] findIntersectionValues2(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int num : nums1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }

        int ans1 = 0;
        int ans2 = 0;

        for (Integer key : map1.keySet()) {
            if (map2.containsKey(key)) {
                ans1 += map1.get(key);
            }
        }

        for (Integer key : map2.keySet()) {
            if (map1.containsKey(key)) {
                ans2 += map2.get(key);
            }
        }

        return new int[]{ans1, ans2};
    }
}
