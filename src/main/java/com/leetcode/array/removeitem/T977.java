package com.leetcode.array.removeitem;

import java.util.Arrays;

public class T977 {

    public int[] sortedSquares(int[] nums) {
        int[] res = Arrays.copyOf(nums, nums.length);

        int i = 0, j = nums.length - 1;
        int k = nums.length - 1;
        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                res[k--] = nums[i] * nums[i];
                i++;
            } else {
                res[k--] = nums[j] * nums[j];
                j--;
            }
        }
        return res;
    }
}
