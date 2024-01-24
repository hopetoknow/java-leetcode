package com.hopetoknow._1431_kids_with_the_greatest_number_of_candies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>(candies.length);
        int maxCandies = 0;

        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        maxCandies -= extraCandies;

        for (int candy : candies) {
            answer.add(candy >= maxCandies);
        }

        return answer;
    }

    public List<Boolean> kidsWithCandies2(int[] candies, int extraCandies) {
        int maxCandies = Arrays.stream(candies).max().getAsInt();

        return Arrays.stream(candies).mapToObj(candy -> candy + extraCandies >= maxCandies).collect(Collectors.toList());
    }
}
