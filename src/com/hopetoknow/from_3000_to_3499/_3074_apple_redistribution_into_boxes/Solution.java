package com.hopetoknow.from_3000_to_3499._3074_apple_redistribution_into_boxes;

import java.util.Arrays;

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int appleSum = 0;

        for (int app : apple) {
            appleSum += app;
        }

        int boxesUsed = 0;
        Arrays.sort(capacity);

        for (int i = capacity.length - 1; i >= 0 && appleSum > 0; i--) {
            appleSum -= capacity[i];
            boxesUsed++;
        }

        return boxesUsed;
    }
}