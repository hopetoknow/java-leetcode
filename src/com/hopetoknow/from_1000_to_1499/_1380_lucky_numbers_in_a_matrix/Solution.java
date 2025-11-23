package com.hopetoknow.from_1000_to_1499._1380_lucky_numbers_in_a_matrix;

import java.util.ArrayList;
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
}
