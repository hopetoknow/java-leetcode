package com.hopetoknow.from_2500_to_2999._2798_number_of_employees_who_met_the_target;

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for (int i : hours) {
            if (i >= target) {
                count++;
            }
        }

        return count;
    }
}
