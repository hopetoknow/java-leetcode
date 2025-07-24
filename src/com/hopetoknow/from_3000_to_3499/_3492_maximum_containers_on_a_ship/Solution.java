package com.hopetoknow.from_3000_to_3499._3492_maximum_containers_on_a_ship;

class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int weight = n * n * w;

        if (weight > maxWeight) {
            return maxWeight / w;
        }

        return n * n;
    }
}
