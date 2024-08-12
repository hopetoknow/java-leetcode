package com.hopetoknow._2678_number_of_senior_citizens;

import java.util.Arrays;

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

    public int countSeniors2(String[] details) {
        int ans = 0;

        for (String d : details) {
            int tens = d.charAt(11) - '0';
            int ones = d.charAt(12) - '0';

            if (tens * 10 + ones > 60) {
                ans++;
            }
        }

        return ans;
    }

    public int countSeniors3(String[] details) {
        int ans = 0;

        for (String d : details) {
            if (Integer.parseInt(d.substring(11, 13)) > 60) {
                ans++;
            }
        }

        return ans;
    }

    public int countSeniors4(String[] details) {
        return (int) Arrays.stream(details)
                .filter(d -> Integer.parseInt(d.substring(11, 13)) > 60)
                .count();
    }
}
