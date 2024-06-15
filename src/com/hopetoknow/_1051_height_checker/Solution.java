package com.hopetoknow._1051_height_checker;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int heightChecker(int[] heights) {
        int ans = 0;
        int[] expected = heights.clone();

        Arrays.sort(expected);

        for (int i = 0; i < heights.length; ++i) {
            if (heights[i] != expected[i]) {
                ans++;
            }
        }

        return ans;
    }

    public int heightChecker2(int[] heights) {
        int[] expected = heights.clone();

        Arrays.sort(expected);

        return IntStream.range(0, heights.length)
                .map(i -> heights[i] != expected[i] ? 1 : 0)
                .sum();
    }
}
