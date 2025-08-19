package com.hopetoknow.from_1000_to_1499._1313_decompress_run_length_encoded_list;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> decompressedList = new ArrayList<>();

        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                decompressedList.add(nums[i + 1]);
            }
        }

        int length = decompressedList.size();
        int[] decompressedArray = new int[length];

        for (int i = 0; i < length; i++) {
            decompressedArray[i] = decompressedList.get(i);
        }

        return decompressedArray;
    }

    public int[] decompressRLElist2(int[] nums) {
        int numsLength = nums.length;
        int finalLength = 0;

        for (int i = 0; i < numsLength; i += 2) {
            finalLength += nums[i];
        }

        int[] decompressedArray = new int[finalLength];
        int index = 0;

        for (int i = 0; i < numsLength; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                decompressedArray[index++] = nums[i + 1];
            }
        }

        return decompressedArray;
    }
}
