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

    public int[][] largestLocal2(int[][] grid) {
        int n = grid.length - 2;
        int[][] maxLocal = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = i; k <= i + 2; k++) {
                    for (int l = j; l <= j + 2; l++) {
                        maxLocal[i][j] = Math.max(maxLocal[i][j], grid[k][l]);
                    }
                }
            }
        }

        return maxLocal;
    }

    public int[][] largestLocal3(int[][] grid) {
        int n = grid.length - 2;
        int[][] maxLocal = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maxLocal[i][j] = getMaxIn3x3(grid, i, j);
            }
        }

        return maxLocal;
    }

    private int getMaxIn3x3(int[][] grid, int row, int col) {
        int max = 1;

        for (int i = row; i <= row + 2; i++) {
            for (int j = col; j <= col + 2; j++) {
                max = Math.max(max, grid[i][j]);
            }
        }

        return max;
    }
}