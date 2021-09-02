package searching.move_zeroes;

/*
 * About
 *
 * Author: soyesdev@GitHub
 * Date  : 2021-09-02
 * URL   : https://leetcode.com/problems/move-zeroes/
 *
 */

public class Solution {
   public void moveZeroes(int[] nums) {
        int length = nums.length;
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        for (int i = index; i < length; i++) {
            nums[index] = 0;
        }
    }
}
