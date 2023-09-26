package com.hopetoknow._1232_check_if_it_is_a_straight_line;

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        int deltaX = x2 - x1;
        int deltaY = y2 - y1;

        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            if (deltaX * (y - y2) != deltaY * (x - x2)) {
                return false;
            }
        }

        return true;
    }
}
