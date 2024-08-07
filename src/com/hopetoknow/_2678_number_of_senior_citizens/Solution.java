package com.hopetoknow._2678_number_of_senior_citizens;

class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;

        for (String d : details) {
            char tens = d.charAt(11);
            char ones = d.charAt(12);

            if (tens > '6' || (tens == '6' && ones > '0')) {
                ans++;
            }
        }

        return ans;
    }
}
