package com.hopetoknow.from_1500_to_1999._1769_minimum_number_of_operations_to_move_all_balls_to_each_box;

class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int operations = 0;

            for (int j = 0; j < n; j++) {
                if (i != j && boxes.charAt(j) == '1') {
                    operations += Math.abs(i - j);
                }
            }

            answer[i] = operations;
        }

        return answer;
    }
}
