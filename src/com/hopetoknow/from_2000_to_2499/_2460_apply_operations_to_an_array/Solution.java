package com.hopetoknow.from_2000_to_2499._2460_apply_operations_to_an_array;

class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] <<= 1;
                nums[i + 1] = 0;
            }
        }

        int zeroCount = 0;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            }
        }

        for (int i = 0; i < n - 1; i++) {
            while (nums[i] == 0 && zeroCount > 0) {
                for (int j = i; j < n - 1; j++) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }

                zeroCount--;
            }
        }

        return nums;
    }

    public int[] applyOperations2(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] <<= 1;
                nums[i + 1] = 0;
            }
        }

        int[] ans = new int[n];
        int i = 0;

        for (int num : nums) {
            if (num != 0) {
                ans[i++] = num;
            }
        }

        return ans;
    }
}
