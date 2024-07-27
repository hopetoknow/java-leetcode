package com.hopetoknow._2418_sort_the_people;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);
        String[] ans = new String[n];
        int index = 0;

        for (int i = heights.length - 1; i >= 0; i--) {
            ans[index++] = map.get(heights[i]);
        }

        return ans;
    }
}
