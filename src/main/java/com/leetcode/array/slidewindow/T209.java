package com.leetcode.array.slidewindow;

public class T209 {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;

        int cur = 0;

        int i = 0, j = 0;
        while (j < nums.length) {
            cur += nums[j++];
            while (cur >= target) {
                res = Math.min(res, j - i);
                cur -= nums[i++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
