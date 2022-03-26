package com.leetcode.array.binarysearch;

public class T69 {
    public int mySqrt(int x) {
        int l = 0, r = x;
        while (l < r) {
            long mid = l + (r - l) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid > x) {
                r = (int) mid;
            } else {
                l = (int) mid + 1;
            }
        }
        if ((long) l * l > x) {
            return l - 1;
        }
        return l;
    }
}
