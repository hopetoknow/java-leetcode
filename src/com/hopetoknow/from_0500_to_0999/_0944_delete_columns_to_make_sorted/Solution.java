package com.hopetoknow.from_0500_to_0999._0944_delete_columns_to_make_sorted;

class Solution {
    public int minDeletionSize(String[] strs) {
        int row = strs.length;
        int column = strs[0].length();
        int ans = 0;

        for (int j = 0; j < column; j++) {
            for (int i = 1; i < row; i++) {
                char curr = strs[i].charAt(j);
                char prev = strs[i - 1].charAt(j);

                if (curr < prev) {
                    ans++;
                    break;
                }
            }
        }

        return ans;
    }
}
