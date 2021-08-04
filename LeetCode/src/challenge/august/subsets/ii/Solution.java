package challenge.august.subsets.ii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * About
 *
 * Author: soyesdev@GitHub
 * Date  : 2021-08-04
 * URL   : https://leetcode.com/explore/challenge/card/august-leetcoding-challenge-2021/613/week-1-august-1st-august-7th/3837/
 *
 */

public class Solution {
   public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return results;
        }

        Arrays.sort(nums);

        List<Integer> subset = new ArrayList<>();
        toFindAllSubsets(nums, results, subset, 0);

        return results;
    }

    private void toFindAllSubsets(int[] nums, List<List<Integer>> results, List<Integer> subset, int startIndex) {  // DFS
        results.add(new ArrayList<>(subset));

        for (int i = startIndex; i < nums.length; i++) {
            if (i != startIndex && nums[i] == nums[i-1]) {
                continue;
            }

            subset.add(nums[i]);
            toFindAllSubsets(nums, results, subset, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}
