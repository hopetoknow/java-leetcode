package com.hopetoknow.from_1000_to_1499._1389_create_target_array_in_the_given_order;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(index[i], nums[i]);
        }

        // return list.stream().mapToInt(num -> num).toArray();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    public int[] createTargetArray2(int[] nums, int[] index) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > index[i]; j--) {
                ans[j] = ans[j - 1];
            }

            ans[index[i]] = nums[i];
        }

        return ans;
    }
}
