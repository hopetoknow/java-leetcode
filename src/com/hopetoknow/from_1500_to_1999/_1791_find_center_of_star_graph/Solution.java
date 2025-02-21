package com.hopetoknow.from_1500_to_1999._1791_find_center_of_star_graph;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] edge : edges) {
            for (int node : edge) {
                map.put(node, map.getOrDefault(node, 0) + 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) == edges.length) {
                return key;
            }
        }

        return -1;
    }
}
