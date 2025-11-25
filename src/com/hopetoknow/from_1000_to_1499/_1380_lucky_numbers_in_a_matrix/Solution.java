package com.hopetoknow.from_1000_to_1499._1380_lucky_numbers_in_a_matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        Set<Integer> rowMins = new HashSet<>();

        for (int row = 0; row < rows; row++) {
            int minIndex = 0;

            for (int column = 1; column < columns; column++) {
                if (matrix[row][column] < matrix[row][minIndex]) {
                    minIndex = column;
                }
            }

            rowMins.add(matrix[row][minIndex]);
        }

        List<Integer> luckyNumbers = new ArrayList<>();

        for (int column = 0; column < columns; column++) {
            int maxIndex = 0;

            for (int row = 1; row < rows; row++) {
                if (matrix[row][column] > matrix[maxIndex][column]) {
                    maxIndex = row;
                }
            }

            if (rowMins.contains(matrix[maxIndex][column])) {
                luckyNumbers.add(matrix[maxIndex][column]);
            }
        }

        return luckyNumbers;
    }

    public List<Integer> luckyNumbers2(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[] rowMins = new int[rows];

        for (int row = 0; row < rows; row++) {
            int minIndex = 0;

            for (int column = 1; column < columns; column++) {
                if (matrix[row][column] < matrix[row][minIndex]) {
                    minIndex = column;
                }
            }

            rowMins[row] = minIndex;
        }

        List<Integer> luckyNumbers = new ArrayList<>();

        for (int column = 0; column < columns; column++) {
            int maxIndex = 0;

            for (int row = 1; row < rows; row++) {
                if (matrix[row][column] > matrix[maxIndex][column]) {
                    maxIndex = row;
                }
            }

            if (rowMins[maxIndex] == column) {
                luckyNumbers.add(matrix[maxIndex][column]);
            }
        }

        return luckyNumbers;
    }

    public List<Integer> luckyNumbers3(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] rowMins = new int[rows];
        int[] colMaxes = new int[columns];
        Arrays.fill(rowMins, 1 << 20);

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                rowMins[row] = Math.min(rowMins[row], matrix[row][column]);
                colMaxes[column] = Math.max(colMaxes[column], matrix[row][column]);
            }
        }

        List<Integer> luckyNumbers = new ArrayList<>();

        for (int row = 0; row < rows; ++row) {
            for (int column = 0; column < columns; ++column) {
                if (rowMins[row] == colMaxes[column]) {
                    luckyNumbers.add(rowMins[row]);
                }
            }
        }

        return luckyNumbers;
    }
}
