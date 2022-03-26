package com.leetcode.array.binarysearch;

public class T34 {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[] {-1, -1};
        }

//        int lb = leftBound(nums, target);
//        if (lb == -1) {
//            return new int[] {-1, -1};
//        } else {
//            return new int[] {lb, rightBound(nums, target)};
//        }

        int rb = rightBound(nums, target);
        if (rb == -1) {
            return new int[] {-1, -1};
        } else {
            return new int[] {leftBound(nums, target) ,rb};
        }
    }

    private int rightBound(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        if (l == 0 && nums[l] == target) {
            return l;
        } else if (l != 0 && nums[l - 1] == target) {
            return l - 1;
        }
        return -1;
    }

    private int leftBound(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        if (l == nums.length || nums[l] != target) {
            return -1;
        }
        return l;
    }
}
