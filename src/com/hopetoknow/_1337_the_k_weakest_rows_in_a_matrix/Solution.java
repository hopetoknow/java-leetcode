package com.hopetoknow._1337_the_k_weakest_rows_in_a_matrix;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[] soldiersPerRow = new int[m];

        for (int i = 0; i < m; i++) {
            int count = 0;

            for (int j = 0; j < n && mat[i][j] == 1; j++) {
                count++;
            }

            soldiersPerRow[i] = count;
        }

        int[] weakestRows = new int[k];

        for (int i = 0; i < k; i++) {
            int currentWeakestRow = 0;

            for (int j = 1; j < m; j++) {
                if (soldiersPerRow[j] < soldiersPerRow[currentWeakestRow]) {
                    currentWeakestRow = j;
                }
            }

            weakestRows[i] = currentWeakestRow;
            soldiersPerRow[currentWeakestRow] = n + 1;
        }

        return weakestRows;
    }

    public int[] kWeakestRows2(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[] soldiersPerRow = new int[m];
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < m; ++i) {
            indices.add(i);
            int[] row = mat[i];
            int left = 0;
            int right = n;

            while (left < right) {
                int mid = (left + right) >> 1;

                if (row[mid] == 0) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            soldiersPerRow[i] = left;
        }

        indices.sort(Comparator.comparingInt(a -> soldiersPerRow[a]));
        int[] weakestRows = new int[k];

        for (int i = 0; i < k; ++i) {
            weakestRows[i] = indices.get(i);
        }

        return weakestRows;
    }
}
