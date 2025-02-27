package com.hopetoknow.from_2000_to_2499._2215_find_the_difference_of_two_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<List<Integer>> ans = Arrays.asList(new ArrayList<>(), new ArrayList<>());

        for (int num : set1) {
            if (!set2.contains(num)) {
                ans.get(0).add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                ans.get(1).add(num);
            }
        }

        return ans;
    }

    public List<List<Integer>> findDifference2(int[] nums1, int[] nums2) {
        Set<Integer> set1 = toSet(nums1);
        Set<Integer> set2 = toSet(nums2);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int num : set1) {
            if (!set2.contains(num)) {
                list1.add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                list2.add(num);
            }
        }

        return List.of(list1, list2);
    }

    private Set<Integer> toSet(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        return set;
    }

    public List<List<Integer>> findDifference3(int[] nums1, int[] nums2) {
        return List.of(getUniqueElementsInFirstArray3(nums1, nums2),
                getUniqueElementsInFirstArray3(nums2, nums1));
    }

    private List<Integer> getUniqueElementsInFirstArray3(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for (int num1 : nums1) {
            boolean existsInNums2 = false;

            for (int num2 : nums2) {
                if (num1 == num2) {
                    existsInNums2 = true;
                    break;
                }
            }

            if (!existsInNums2) {
                set.add(num1);
            }
        }

        return new ArrayList<>(set);
    }

    public List<List<Integer>> findDifference4(int[] nums1, int[] nums2) {
        return List.of(getUniqueElementsInFirstArray4(nums1, nums2),
                getUniqueElementsInFirstArray4(nums2, nums1));
    }

    private List<Integer> getUniqueElementsInFirstArray4(int[] nums1, int[] nums2) {
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums2) {
            set2.add(num);
        }

        Set<Integer> set = new HashSet<>();

        for (int num : nums1) {
            if (!set2.contains(num)) {
                set.add(num);
            }
        }

        return new ArrayList<>(set);
    }

    public List<List<Integer>> findDifference5(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        return List.of(
                set1.stream().filter(num -> !set2.contains(num)).toList(),
                set2.stream().filter(num -> !set1.contains(num)).toList()
        );
    }

    public List<List<Integer>> findDifference6(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2)
                .filter(num -> !set1.contains(num))
                .boxed()
                .collect(Collectors.toSet());

        Arrays.stream(nums2).forEach(set1::remove);

        return List.of(new ArrayList<>(set1), new ArrayList<>(set2));
    }

    public List<List<Integer>> findDifference7(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        Set<Integer> unique1 = new HashSet<>(set1);
        Set<Integer> unique2 = new HashSet<>(set2);

        unique1.removeAll(set2);
        unique2.removeAll(set1);

        return List.of(new ArrayList<>(unique1), new ArrayList<>(unique2));
    }
}
