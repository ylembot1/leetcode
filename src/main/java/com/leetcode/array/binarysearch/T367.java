package com.leetcode.array.binarysearch;

public class T367 {
    public boolean isPerfectSquare(int num) {
        int l = 0, r = num;
        while (l < r) {
            long mid = l + (r - l) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                r = (int) mid;
            } else {
                l = (int) mid + 1;
            }
        }
        return l * l == num;
    }
}
