package com.hopetoknow._2037_minimum_number_of_moves_to_seat_everyone;

import java.util.Arrays;
import java.util.PriorityQueue;
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

    public int minMovesToSeat3(int[] seats, int[] students) {
        PriorityQueue<Integer> seatQueue = new PriorityQueue<>();
        PriorityQueue<Integer> studentQueue = new PriorityQueue<>();

        for (int i = 0; i < seats.length; i++) {
            seatQueue.add(seats[i]);
            studentQueue.add(students[i]);
        }

        int ans = 0;

        while (!seatQueue.isEmpty()) {
            ans += Math.abs(seatQueue.poll() - studentQueue.poll());
        }

        return ans;
    }

    public int minMovesToSeat4(int[] seats, int[] students) {
        int maxPosition = 100;
        int[] seatCount = new int[maxPosition + 1];
        int[] studentCount = new int[maxPosition + 1];

        for (int i = 0; i < seats.length; i++) {
            seatCount[seats[i]]++;
            studentCount[students[i]]++;
        }

        int seatIndex = 0;
        int studentIndex = 0;
        int ans = 0;

        while (seatIndex <= maxPosition && studentIndex <= maxPosition) {
            while (seatIndex <= maxPosition && seatCount[seatIndex] == 0) {
                seatIndex++;
            }

            while (studentIndex <= maxPosition && studentCount[studentIndex] == 0) {
                studentIndex++;
            }

            if (seatIndex <= maxPosition && studentIndex <= maxPosition) {
                int minCount = Math.min(seatCount[seatIndex], studentCount[studentIndex]);
                ans += minCount * Math.abs(seatIndex - studentIndex);
                seatCount[seatIndex] -= minCount;
                studentCount[studentIndex] -= minCount;
            }

//            if (seatIndex <= maxPosition && studentIndex <= maxPosition) {
//                ans += Math.abs(seatIndex - studentIndex);
//                seatCount[seatIndex]--;
//                studentCount[studentIndex]--;
//            }
        }

        return ans;
    }
}
