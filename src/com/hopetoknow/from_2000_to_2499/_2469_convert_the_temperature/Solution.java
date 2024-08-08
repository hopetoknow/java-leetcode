package com.hopetoknow.from_2000_to_2499._2469_convert_the_temperature;

class Solution {
    public double[] convertTemperature(double celsius) {
        return new double[] {
                celsius + 273.15,
                celsius * 1.80 + 32.00
        };
    }
}
