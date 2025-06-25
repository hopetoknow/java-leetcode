package com.hopetoknow.from_0000_to_0499._0349_intersection_of_two_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> resultSet = new HashSet<>();

        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] ans = new int[resultSet.size()];
        int i = 0;

        for (int num : resultSet) {
            ans[i++] = num;
        }

        return ans;
    }

    public int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        return Arrays.stream(nums2)
                .distinct()
                .filter(set1::contains)
                .toArray();
    }

    public int[] intersection3(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.toSet());

        return Arrays.stream(nums2)
                .distinct()
                .filter(set1::contains)
                .toArray();
    }

    public int[] intersection4(int[] nums1, int[] nums2) {
        boolean[] seen = new boolean[1001];

        for (int num : nums1) {
            seen[num] = true;
        }

        List<Integer> intersection = new ArrayList<>();

        for (int num : nums2) {
            if (seen[num]) {
                intersection.add(num);
                seen[num] = false;
            }
        }

        int[] ans = new int[intersection.size()];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = intersection.get(i);
        }

        return ans;
    }
}
