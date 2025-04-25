package com.hopetoknow.from_3500_to_3999._3516_find_closest_person;

class Solution {
    public int findClosest(int x, int y, int z) {
        int d1 = Math.abs(z - x);
        int d2 = Math.abs(z - y);

        if (d1 < d2) {
            return 1;
        } else if (d2 < d1) {
            return 2;
        } else {
            return 0;
        }
    }

    public int findClosest2(int x, int y, int z) {
        int d1 = Math.abs(z - x);
        int d2 = Math.abs(z - y);

        return d1 < d2 ? 1 : (d2 < d1 ? 2 : 0);
    }
}
