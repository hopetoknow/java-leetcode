package com.hopetoknow.from_3000_to_3499._3248_snake_in_matrix;

import java.util.List;

class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int ans = 0;

        for (String command : commands) {
            if ("UP".equals(command)) {
                ans -= n;
            } else if ("RIGHT".equals(command)) {
                ans += 1;
            } else if ("DOWN".equals(command)) {
                ans += n;
            } else if ("LEFT".equals(command)) {
                ans -= 1;
            }
        }

        return ans;
    }
}
