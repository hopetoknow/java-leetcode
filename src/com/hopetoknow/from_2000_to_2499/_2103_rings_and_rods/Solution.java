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

            // Lines 16-20 can be replaced with a cleaner one-liner:
            // rodToColorsMap.computeIfAbsent(rod, k -> new HashSet<>()).add(color);
        }

        int count = 0;

        for (Set<Character> colors : rodToColorsMap.values()) {
            if (colors.size() == 3) {
                count++;
            }
        }

        return count;
    }

    public int countPoints2(String rings) {
        boolean[][] rods = new boolean[10][3];

        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';

            int colorIndex = (color == 'R') ? 0 : (color == 'G' ? 1 : 2);
            rods[rod][colorIndex] = true;
        }

        int count = 0;

        for (boolean[] rod : rods) {
            if (rod[0] && rod[1] && rod[2]) {
                count++;
            }
        }

        return count;
    }

    public int countPoints3(String rings) {
        int[] rods = new int[10];

        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';

            int colorBit = (color == 'R') ? 1 : (color == 'G' ? 2 : 4);
            rods[rod] |= colorBit;
        }

        int count = 0;

        for (int rod : rods) {
            if (rod == 7) {
                count++;
            }
        }

        return count;
    }
}
