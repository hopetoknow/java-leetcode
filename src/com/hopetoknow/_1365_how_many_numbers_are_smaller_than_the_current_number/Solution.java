package com.hopetoknow._1365_how_many_numbers_are_smaller_than_the_current_number;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            int counter = 0;

            for (int j = 0; j < length; j++) {
                if (nums[j] < nums[i]) {
                    counter++;
                }
            }

            answer[i] = counter;
        }

        return answer;
    }
}
