package com.hopetoknow.easy._1337_the_k_weakest_rows_in_a_matrix;

class Solution {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int matLength = mat.length;
        int soldiersNumberInCurrentRow;
        int[] soldiersPerRow = new int[matLength];

        for (int i = 0; i < matLength; i++) {
            soldiersNumberInCurrentRow = 0;
            for (int j = 0; j < matLength && mat[i][j] != 0; j++) {
                soldiersNumberInCurrentRow++;
            }

            soldiersPerRow[i] = soldiersNumberInCurrentRow;
        }

        int[] kWeakestRows = new int[k];
        int currentWeakestRow;

        for (int i = 0; i < kWeakestRows.length; i++) {
            currentWeakestRow = 0;
            for (int j = 1; j < soldiersPerRow.length; j++) {
                if (soldiersPerRow[j] < soldiersPerRow[currentWeakestRow]) {
                    currentWeakestRow = j;
                }
            }

            kWeakestRows[i] = currentWeakestRow;
            soldiersPerRow[currentWeakestRow] = Integer.MAX_VALUE;
        }

        return kWeakestRows;
    }
}
