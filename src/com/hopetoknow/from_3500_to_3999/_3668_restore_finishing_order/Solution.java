package com.hopetoknow.from_3500_to_3999._3668_restore_finishing_order;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> friendsSet = new HashSet<>();

        for (int f : friends) {
            friendsSet.add(f);
        }

        int[] result = new int[friends.length];
        int index = 0;

        for (int o : order) {
            if (friendsSet.contains(o)) {
                result[index++] = o;
            }
        }

        return result;
    }
}
