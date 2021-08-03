package challenge.august.twosum;

/*
 * About
 *
 * Author: soyesdev@GitHub
 * Date  : 2021-08-03
 * URL   : https://leetcode.com/explore/challenge/card/august-leetcoding-challenge-2021/613/week-1-august-1st-august-7th/3836/
 *
 */

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int j = i+1;
            while (i != j && j < nums.length) {
                if (target == nums[i] + nums [j]) {
                    answer[0] = i;
                    answer[1] = j;
                }
                j++;
            }
        }
        return answer;
    }
}
