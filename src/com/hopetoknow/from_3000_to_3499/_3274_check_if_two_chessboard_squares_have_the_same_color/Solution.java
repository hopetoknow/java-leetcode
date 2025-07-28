package com.hopetoknow.from_3000_to_3499._3274_check_if_two_chessboard_squares_have_the_same_color;

class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return isBlack(coordinate1) == isBlack(coordinate2);
    }

    private boolean isBlack(String coordinate) {
        int letter = coordinate.charAt(0) - 'a' + 1;
        int number = coordinate.charAt(1) - '0';

        return (letter + number) % 2 == 0;
    }
}
