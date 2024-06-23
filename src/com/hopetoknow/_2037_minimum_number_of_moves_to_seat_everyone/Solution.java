package com.hopetoknow._2037_minimum_number_of_moves_to_seat_everyone;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int ans = 0;

        for (int i = 0; i < seats.length; i++) {
            ans += Math.abs(seats[i] - students[i]);
        }

        return ans;
    }

    public int minMovesToSeat2(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        return IntStream.range(0, seats.length)
                .map(i -> Math.abs(seats[i] - students[i]))
                .sum();
    }
}
