package com.hopetoknow._2956_find_common_elements_between_two_arrays;

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
}
