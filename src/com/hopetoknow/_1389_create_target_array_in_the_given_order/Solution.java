package com.hopetoknow._1389_create_target_array_in_the_given_order;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int length = nums.length;
        int[] target = new int[length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            list.add(index[i], nums[i]);
        }

        for (int i = 0; i < length; i++) {
            target[i] = list.get(i);
        }

        return target;
    }
}

