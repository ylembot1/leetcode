package com.leetcode.mess;

import java.util.ArrayList;
import java.util.List;

public class T78 {

    public void dfs(int[] nums, List<List<Integer>> res, List<Integer> path, int idx) {
        if (idx > nums.length) {
            return;
        }
        res.add(new ArrayList<>(path));
        for (int i = idx; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(nums, res, path, i + 1);
            path.remove(path.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        List<Integer> path = new ArrayList<>();

        dfs(nums, res, path, 0);
        return res;
    }
}
