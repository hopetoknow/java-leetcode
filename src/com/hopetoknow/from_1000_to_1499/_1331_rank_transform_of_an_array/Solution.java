package com.hopetoknow.from_1000_to_1499._1331_rank_transform_of_an_array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] sortedArr = arr.clone();

        Arrays.sort(sortedArr);

        for (int num : sortedArr) {
            map.putIfAbsent(num, map.size() + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }

    public int[] arrayRankTransform2(int[] arr) {
        Set<Integer> set = new TreeSet<>();

        for (int num : arr) {
            set.add(num);
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer num : set) {
            map.put(num, map.size() + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }

    public int[] arrayRankTransform3(int[] arr) {
        int n = arr.length;
        int[] sortedArr = arr.clone();
        int uniqueCount  = 0;

        Arrays.sort(sortedArr);

        for (int i = 0; i < n; i++) {
            if (i == 0 || sortedArr[i] != sortedArr[i - 1]) {
                sortedArr[uniqueCount++] = sortedArr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = Arrays.binarySearch(sortedArr, 0, uniqueCount, arr[i]) + 1;
        }

        return arr;
    }
}
