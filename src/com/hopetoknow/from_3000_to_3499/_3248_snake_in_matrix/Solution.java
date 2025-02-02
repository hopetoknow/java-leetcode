package com.hopetoknow.from_3000_to_3499._3248_snake_in_matrix;

import java.util.List;
import java.util.Map;

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

    public int finalPositionOfSnake2(int n, List<String> commands) {
        int i = 0;
        int j = 0;

        for (String command : commands) {
            switch (command.charAt(0)) {
                case 'U' -> i--;
                case 'R' -> j++;
                case 'D' -> i++;
                case 'L' -> j--;
            }
        }

        return i * n + j;
    }

    public int finalPositionOfSnake3(int n, List<String> commands) {
        Map<String, Integer> map = Map.of(
                "UP", -n,
                "RIGHT", 1,
                "DOWN", n,
                "LEFT", -1
        );
        int ans = 0;

        for (String command : commands) {
            ans += map.get(command);
        }

        return ans;
    }
}
