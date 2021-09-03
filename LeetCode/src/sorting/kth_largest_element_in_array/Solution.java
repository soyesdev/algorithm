package sorting.kth_largest_element_in_array;

/*
 * About
 *
 * Author: soyesdev@GitHub
 * Date  : 2021-09-03
 * URL   : https://leetcode.com/problems/kth-largest-element-in-an-array/
 *
 */

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public int findKthLargestUsingPriorityQueue(int[] nums, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i : nums) {
            minHeap.offer(i);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
