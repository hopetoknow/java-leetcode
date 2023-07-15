package com.hopetoknow._1351_count_negative_numbers_in_a_sorted_matrix;

class Solution {
    public int countNegatives(int[][] grid) {
        int numberOfNegativeNumbers = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    numberOfNegativeNumbers++;
                }
            }
        }

        return numberOfNegativeNumbers;
    }
}
