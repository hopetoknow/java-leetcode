package com.hopetoknow.from_3000_to_3499._3151_special_array_i;

class Solution {
    public boolean isArraySpecial(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] - nums[i - 1]) % 2 == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isArraySpecial2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] + nums[i - 1] & 1) == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isArraySpecial3(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (((nums[i] ^ nums[i-1]) & 1) == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isArraySpecial4(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] & 1) == (nums[i - 1] & 1)) {
                return false;
            }
        }

        return true;
    }

    public boolean isArraySpecial5(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (((nums[i] & 1) ^ (nums[i - 1] & 1)) == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isArraySpecial6(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] % 2 == nums[i - 1] % 2) {
                return false;
            }
        }

        return true;
    }
}
