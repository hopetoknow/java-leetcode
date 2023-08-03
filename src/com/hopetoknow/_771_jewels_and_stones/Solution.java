package com.hopetoknow._771_jewels_and_stones;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set set = new HashSet();

        for (char jewel : jewels.toCharArray()) {
            set.add(jewel);
        }

        for (char stone : stones.toCharArray()) {
            if (set.contains(stone)) {
                count++;
            }
        }

        return count;
    }

    public int numJewelsInStones2(String jewels, String stones) {
        int[] asciiArr = new int[123];
        int count = 0;

        for (char jewel : jewels.toCharArray()) {
            asciiArr[jewel] = 1;
        }

        for (char stone : stones.toCharArray()) {
            count += asciiArr[stone];
        }

        return count;
    }
}
