package com.hopetoknow._1598_crawler_log_folder;

class Solution {
    public int minOperations(String[] logs) {
        int ans = 0;

        for (String log : logs) {
            if (log.equals("../")) {
                ans = Math.max(0, ans - 1);
            } else if (!log.equals("./")) {
                ans++;
            }
        }

        return ans;
    }
}
