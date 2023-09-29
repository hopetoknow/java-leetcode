package com.hopetoknow._1773_count_items_matching_a_rule;

import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for (List<String> item : items) {
            if ("type".equals(ruleKey) && ruleValue.equals(item.get(0))) {
                count++;
            } else if ("color".equals(ruleKey) && ruleValue.equals(item.get(1))) {
                count++;
            } else if ("name".equals(ruleKey) && ruleValue.equals(item.get(2))) {
                count++;
            }
        }

        return count;
    }
}
