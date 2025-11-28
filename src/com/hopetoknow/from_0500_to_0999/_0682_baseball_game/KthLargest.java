package com.hopetoknow.from_0500_to_0999._0682_baseball_game;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> scores = new ArrayDeque<>();

        for (String operation : operations) {
            if ("+".equals(operation)) {
                int top = scores.pop();
                int sum = scores.peek() + top;
                scores.push(top);
                scores.push(sum);
            } else if("D".equals(operation)) {
                scores.push(scores.peek() * 2);
            } else if("C".equals(operation)) {
                scores.pop();
            } else {
                scores.push(Integer.parseInt(operation));
            }
        }

        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        return sum;
    }

    public int calPoints2(String[] operations) {
        Deque<Integer> scores = new ArrayDeque<>();

        for (String operation : operations) {
            if ("+".equals(operation)) {
                int top = scores.pop();
                int sum = scores.peek() + top;
                scores.push(top);
                scores.push(sum);
            } else if("D".equals(operation)) {
                scores.push(scores.peek() << 1);
            } else if("C".equals(operation)) {
                scores.pop();
            } else {
                scores.push(Integer.parseInt(operation));
            }
        }

        return scores.stream().mapToInt(Integer::intValue).sum();
    }
}
