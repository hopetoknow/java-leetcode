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

    public int calPoints3(String[] operations) {
        int[] scores = new int[operations.length];
        int index = 0;

        for (String operation : operations) {
            switch (operation) {
                case "+":
                    scores[index] = scores[index - 1] + scores[index - 2];
                    index++;
                    break;
                case "D":
                    scores[index] = scores[index - 1] * 2;
                    index++;
                    break;
                case "C":
                    index--;
                    break;
                default:
                    scores[index++] = Integer.parseInt(operation);
            }
        }

        int sum = 0;

        for (int i = 0; i < index; i++) {
            sum += scores[i];
        }

        return sum;
    }

    public int calPoints4(String[] operations) {
        int[] scores = new int[operations.length];
        int index = 0;

        for (String op : operations) {
            switch (op) {
                case "+" -> {
                    scores[index] = scores[index - 1] + scores[index - 2];
                    index++;
                }
                case "D" -> {
                    scores[index] = scores[index - 1] << 1;
                    index++;
                }
                case "C" -> index--;
                default -> scores[index++] = Integer.parseInt(op);
            }
        }

        int sum = 0;

        for (int i = 0; i < index; i++) {
            sum += scores[i];
        }

        return sum;
    }

    public int calPoints5(String[] operations) {
        int[] scores = new int[operations.length];
        int sum = 0;
        int index = 0;

        for (String op : operations) {
            sum += switch (op) {
                case "+" -> {
                    int newScore = scores[index - 1] + scores[index - 2];
                    scores[index++] = newScore;
                    yield newScore;
                }
                case "D" -> {
                    int newScore = scores[index - 1] << 1;
                    scores[index++] = newScore;
                    yield newScore;
                }
                case "C" -> -scores[--index];
                default -> {
                    int newScore = Integer.parseInt(op);
                    scores[index++] = newScore;
                    yield newScore;
                }
            };
        }

        return sum;
    }
}
