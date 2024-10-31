package com.hopetoknow.from_2000_to_2499._2373_largest_local_values_in_a_matrix;

class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length - 2;
        int[][] maxLocal = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int max = 1;

                for (int k = i; k <= i + 2; k++) {
                    for (int l = j; l <= j + 2; l++) {
                        max = Math.max(grid[k][l], max);
                    }
                }

                maxLocal[i][j] = max;
            }
        }

        return maxLocal;
    }
}