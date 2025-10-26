package com.hopetoknow.from_0500_to_0999._0905_sort_array_by_parity;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int left = 0, right = n - 1;

        for (int num : nums) {
            if ((num & 1) == 0) {
                ans[left++] = num;
            } else {
                ans[right--] = num;
            }
        }

        return ans;
    }

    public int[] sortArrayByParity2(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            if ((nums[left] & 1) == 0) {
                left++;
            } else if ((nums[right] & 1) == 1) {
                right--;
            } else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        return nums;
    }

    public int[] sortArrayByParity3(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            while (left < right && (nums[left] & 1) == 0) {
                left++;
            }

            while (left < right && (nums[right] & 1) == 1) {
                right--;
            }

            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        return nums;
    }
}
