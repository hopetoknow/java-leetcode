package com.hopetoknow.from_2500_to_2999._2558_take_gifts_from_the_richest_pile;

import java.util.PriorityQueue;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        for (int i = 0; i < k; i++) {
            int max = gifts[0];
            int maxIndex = 0;

            for (int j = 1; j < gifts.length; j++) {
                if (gifts[j] > max) {
                    max = gifts[j];
                    maxIndex = j;
                }
            }

            gifts[maxIndex] = (int) Math.sqrt(gifts[maxIndex]);
        }

        long totalGifts = 0;

        for (int pile : gifts) {
            totalGifts += pile;
        }

        return totalGifts;
    }

    public long pickGifts2(int[] gifts, int k) {
        PriorityQueue<Integer> giftsQueue = new PriorityQueue<>((a, b) -> b - a);

        for (int pile : gifts) {
            giftsQueue.add(pile);
        }

        while (k-- > 0) {
            giftsQueue.add((int) Math.sqrt(giftsQueue.poll()));
        }

        long totalGifts = 0;

        for (int pile : giftsQueue) {
            totalGifts += pile;
        }

        return totalGifts;
    }
}
