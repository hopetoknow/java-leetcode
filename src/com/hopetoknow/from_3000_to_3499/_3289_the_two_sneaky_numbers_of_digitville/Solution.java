package com.hopetoknow.from_3000_to_3499._3289_the_two_sneaky_numbers_of_digitville;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[2];
        int i = 0;

        for (Integer key : map.keySet()) {
            if (map.get(key)  == 2) {
                ans[i++] = key;

                if (i == 2) {
                    break;
                }
            }
        }

        return ans;
    }

    public int[] getSneakyNumbers2(int[] nums) {
        int[] count = new int[100];
        int[] ans = new int[2];
        int i = 0;

        for (int num : nums) {
            if (++count[num] == 2) {
                ans[i++] = num;

                if (i == 2) {
                    break;
                }
            }
        }

        return ans;
    }

    public int[] getSneakyNumbers3(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        int i = 0;

//        for (int num : nums) {
//            if (set.contains(num)) {
//                ans[i++] = num;
//
//                if (i == 2) {
//                    break;
//                }
//            }
//            else {
//                set.add(num);
//            }
//        }

        for (int num : nums) {
            if (!set.add(num)) {
                ans[i++] = num;

                if (i == 2) {
                    break;
                }
            }
        }

        return ans;
    }

    public int[] getSneakyNumbers4(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return map.entrySet().stream()
                .filter(entry -> entry.getValue() == 2)
                .limit(2)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public int[] getSneakyNumbers5(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 2)
                .limit(2)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
