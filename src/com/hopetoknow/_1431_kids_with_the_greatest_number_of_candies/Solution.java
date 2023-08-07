package com.hopetoknow._1431_kids_with_the_greatest_number_of_candies;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>(candies.length);
        int maxCandies = candies[0];

        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        maxCandies -= extraCandies;

        for (int candy : candies) {
            answer.add(candy >= maxCandies);
        }

        return answer;
    }
}
