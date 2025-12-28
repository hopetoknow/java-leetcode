package com.hopetoknow.from_3000_to_3499._3075_maximize_happiness_of_selected_children;

import java.util.Arrays;

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long happinessSum = 0;

        for (int i = 0, n = happiness.length; i < k; i++) {
            int curr = happiness[n - i - 1] - i;
            happinessSum += Math.max(curr, 0);
        }

        return happinessSum;
    }
}
