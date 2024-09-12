package com.hopetoknow.from_3000_to_3499._3280_convert_date_to_binary;

class Solution {
    public String convertDateToBinary(String date) {
        String[] dateParts = date.split("-");

        for (int i = 0; i < dateParts.length; i++) {
            dateParts[i] = Integer.toBinaryString(Integer.parseInt(dateParts[i]));
        }

        return String.join("-", dateParts);
    }
}
