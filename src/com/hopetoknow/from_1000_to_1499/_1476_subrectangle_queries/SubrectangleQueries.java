package com.hopetoknow.from_1000_to_1499._1476_subrectangle_queries;

import java.util.LinkedList;

class SubrectangleQueries {
    private int[][] rectangle;
    private LinkedList<int[]> updates = new LinkedList<>();

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        updates.addFirst(new int[] {row1, col1, row2, col2, newValue});
    }

    public int getValue(int row, int col) {
        for (int[] update : updates) {
            if (update[0] <= row && row <= update[2] && update[1] <= col && col <= update[3]) {
                return update[4];
            }
        }

        return rectangle[row][col];
    }
}

class SubrectangleQueries2 {
    private int[][] rectangle;

    public SubrectangleQueries2(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                this.rectangle[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return this.rectangle[row][col];
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */
