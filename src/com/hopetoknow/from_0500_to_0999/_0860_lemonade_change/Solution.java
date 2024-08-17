package com.hopetoknow.from_0500_to_0999._0860_lemonade_change;

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;

        for (int bill : bills) {
            switch (bill) {
                case 5 -> fives++;
                case 10 -> {
                    fives--;
                    tens++;
                }
                case 20 -> {
                    if (tens > 0) {
                        tens--;
                        fives--;
                    } else {
                        fives -= 3;
                    }
                }
            }

            if (fives < 0) {
                return false;
            }
        }

        return true;
    }
}
