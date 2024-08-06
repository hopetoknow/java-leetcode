package com.hopetoknow.from_1000_to_1499._1342_number_of_steps_to_reduce_a_number_to_zero;

class Solution {
    public int numberOfSteps(int num) {
        int numberOfSteps = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }

            numberOfSteps++;
        }

        return numberOfSteps;
    }

    public int numberOfSteps2(int num) {
        int numberOfSteps = 0;

        while (num > 0) {
            if ((num & 1) == 1) {
                num ^= 1;
            } else {
                num >>= 1;
            }

            numberOfSteps++;
        }

        return numberOfSteps;
    }
}
