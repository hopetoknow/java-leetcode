package com.hopetoknow.from_3000_to_3499._3131_find_the_integer_added_to_array_i;

import java.util.Arrays;

class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int nums1Min = nums1[0];
        int nums2Min = nums2[0];

        for (int i = 1; i < nums1.length; i++) {
            nums1Min = Math.min(nums1Min, nums1[i]);
            nums2Min = Math.min(nums2Min, nums2[i]);
        }

        return nums2Min - nums1Min;
    }

    public int addedInteger2(int[] nums1, int[] nums2) {
        return Arrays.stream(nums2).min().getAsInt() - Arrays.stream(nums1).min().getAsInt();
    }
}
