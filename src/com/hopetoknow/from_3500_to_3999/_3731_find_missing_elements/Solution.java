package com.hopetoknow.from_3500_to_3999._3731_find_missing_elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> numsAsSet = new HashSet<>();

        for (int num : nums) {
            numsAsSet.add(num);
        }

        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[nums.length - 1];
        List<Integer> ans = new ArrayList<>();

        for (int i = smallest + 1; i < largest; i++) {
            if (!numsAsSet.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }

    public List<Integer> findMissingElements2(int[] nums) {
        Set<Integer> numsAsSet = new HashSet<>();
        int smallest = 101;
        int largest = 0;

        for (int num : nums) {
            numsAsSet.add(num);
            smallest = Math.min(smallest, num);
            largest = Math.max(largest, num);
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = smallest + 1; i < largest; i++) {
            if (!numsAsSet.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }

    public List<Integer> findMissingElements3(int[] nums) {
        boolean[] present = new boolean[101];
        int smallest = 101;
        int largest = 0;

        for (int num : nums) {
            present[num] = true;
            smallest = Math.min(smallest, num);
            largest = Math.max(largest, num);
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = smallest + 1; i < largest; i++) {
            if (!present[i]) {
                ans.add(i);
            }
        }

        return ans;
    }
}
