package com.hopetoknow._2011_final_value_of_variable_after_performing_operations;

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int counter = 0;

        for (String operation : operations) {
            if ("++X".equals(operation) || "X++".equals(operation)) {
                counter++;
            } else {
                counter--;
            }
        }

        return counter;
    }

    public int finalValueAfterOperations2(String[] operations) {
        int counter = 0;

        for (String operation : operations) {
            if (operation.charAt(1) == '+') {
                counter++;
            } else {
                counter--;
            }
        }

        return counter;
    }
}
