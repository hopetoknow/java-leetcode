package com.hopetoknow.easy._1232_check_if_it_is_a_straight_line;

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];

        int deltaX = x1 - x0;
        int deltaY = y1 - y0;

        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            if (deltaX * (y - y1) != deltaY * (x - x1)) {
                return false;
            }
        }

        return true;
    }
}
