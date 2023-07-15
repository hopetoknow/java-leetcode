package com.hopetoknow._1337_the_k_weakest_rows_in_a_matrix;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int matLength = mat.length;
        int[] soldiersPerRow = new int[matLength];

        for (int i = 0; i < matLength; i++) {
            int soldiersNumberInCurrentRow = 0;

            for (int j = 0; j < mat[i].length && mat[i][j] != 0; j++) {
                soldiersNumberInCurrentRow++;
            }

            soldiersPerRow[i] = soldiersNumberInCurrentRow;
        }

        int[] kWeakestRows = new int[k];
        int currentWeakestRow;

        for (int i = 0; i < k; i++) {
            currentWeakestRow = 0;

            for (int j = 1; j < soldiersPerRow.length; j++) {
                if (soldiersPerRow[j] < soldiersPerRow[currentWeakestRow]) {
                    currentWeakestRow = j;
                }
            }

            kWeakestRows[i] = currentWeakestRow;
            soldiersPerRow[currentWeakestRow] = 101;
        }

        return kWeakestRows;
    }
}
