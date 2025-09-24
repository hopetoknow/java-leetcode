package com.hopetoknow.from_3500_to_3999._3683_earliest_time_to_finish_one_task;

import java.util.Arrays;

class Solution {
    public int earliestTime(int[][] tasks) {
        int earliestTime = 200;

        for (int[] task : tasks) {
            earliestTime = Math.min(earliestTime, task[0] + task[1]);
        }

        return earliestTime;
    }

    public int earliestTime2(int[][] tasks) {
        return Arrays.stream(tasks)
                .mapToInt(task -> task[0] + task[1])
                .min()
                .orElse(200);
    }
}
