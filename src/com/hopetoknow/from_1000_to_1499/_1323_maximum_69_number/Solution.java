package com.hopetoknow.from_1000_to_1499._1323_maximum_69_number;

class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder();

        for (char ch : String.valueOf(num).toCharArray()) {
            if (ch == '6') {
                sb.append("9");
                break;
            }

            sb.append(ch);
        }

        return Integer.parseInt(sb.toString());
    }
}
