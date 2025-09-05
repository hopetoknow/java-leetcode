package com.hopetoknow.from_3500_to_3999._3668_restore_finishing_order;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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

    public int[] recoverOrder2(int[] order, int[] friends) {
        int n = order.length;
        int[] position = new int[n + 1];

        for (int i = 0; i < n; ++i) {
            position[order[i]] = i;
        }

        return Arrays.stream(friends)
                .boxed()
                .sorted(Comparator.comparingInt(a -> position[a]))
//              .sorted((a, b) -> position[a] - position[b])
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public int[] recoverOrder3(int[] order, int[] friends) {
        Set<Integer> friendsSet = Arrays.stream(friends).boxed().collect(Collectors.toSet());

        return Arrays.stream(order).filter(friendsSet::contains).toArray();
    }
}
