package com.hopetoknow.from_3000_to_3499._3280_convert_date_to_binary;

class Solution {
    public String convertDateToBinary(String date) {
        String[] dateParts = date.split("-");

        for (int i = 0; i < dateParts.length; i++) {
            dateParts[i] = Integer.toBinaryString(Integer.parseInt(dateParts[i]));
        }

        return String.join("-", dateParts);
    }

    public String convertDateToBinary2(String date) {
        StringBuilder sb = new StringBuilder();

        for (String str : date.split("-")) {
            sb.append(Integer.toBinaryString(Integer.parseInt(str)));
            sb.append("-");
        }

        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}
