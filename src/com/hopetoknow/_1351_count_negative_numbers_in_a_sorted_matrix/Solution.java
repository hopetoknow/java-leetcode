package com.hopetoknow._1351_count_negative_numbers_in_a_sorted_matrix;

class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;

        for (int[] row : grid) {
            for (int num : row) {
                if (num < 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public int countNegatives2(int[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i = m - 1, j = 0; i >= 0 && j < n;) {
            if (grid[i][j] < 0) {
                count += n - j;
                i--;
            } else {
                j++;
            }
        }

        return count;
    }

    public int countNegatives3(int[][] grid) {
        int count = 0;
        int n = grid[0].length;

        for (int[] row : grid) {
            int left = 0;
            int right = n - 1;

            while (left <= right) {
                int mid = (left + right) >> 1;

                if (row[mid] < 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            count += n - left;
        }

        return count;
    }
}
