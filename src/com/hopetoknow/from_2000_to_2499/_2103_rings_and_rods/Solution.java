package com.hopetoknow.from_2000_to_2499._2103_rings_and_rods;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int countPoints(String rings) {
        Map<Integer, Set<Character>> rodToColorsMap = new HashMap<>();

        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';

            if (!rodToColorsMap.containsKey(rod)) {
                rodToColorsMap.put(rod, new HashSet<>());
            }

            rodToColorsMap.get(rod).add(color);
        }

        int count = 0;

        for (Set<Character> colors : rodToColorsMap.values()) {
            if (colors.size() == 3) {
                count++;
            }
        }

        return count;
    }
}
