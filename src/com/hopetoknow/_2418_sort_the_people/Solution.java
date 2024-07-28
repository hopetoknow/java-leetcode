package com.hopetoknow._2418_sort_the_people;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);
        String[] ans = new String[n];

        for (int i = n - 1; i >= 0; i--) {
            ans[n - i - 1] = map.get(heights[i]);
        }

        return ans;
    }

    public String[] sortPeople2(String[] names, int[] heights) {
        int n = names.length;
        Map<Integer, String> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }

        String[] ans = new String[n];
        int i = n - 1;

        for (int height : map.keySet()) {
            ans[i--] = map.get(height);
        }

        return ans;
    }
}
