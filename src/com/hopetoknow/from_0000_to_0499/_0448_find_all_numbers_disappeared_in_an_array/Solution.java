package com.hopetoknow.from_0000_to_0499._0448_find_all_numbers_disappeared_in_an_array;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            while (nums[i] != nums[nums[i] - 1]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
}
