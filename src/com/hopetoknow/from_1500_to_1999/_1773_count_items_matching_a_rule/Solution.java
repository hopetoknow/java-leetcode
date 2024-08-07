package com.hopetoknow.from_1500_to_1999._1773_count_items_matching_a_rule;

import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int ruleIndex = 0;

        if ("color".equals(ruleKey)) {
            ruleIndex = 1;
        } else if ("name".equals(ruleKey)){
            ruleIndex = 2;
        }

        for (List<String> item : items) {
             if (ruleValue.equals(item.get(ruleIndex))) {
                 count++;
             }
        }

        return count;
    }
}
