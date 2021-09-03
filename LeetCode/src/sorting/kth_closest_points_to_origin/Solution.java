package sorting.kth_closest_points_to_origin;

import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 1;
        Solution solution = new Solution();
        solution.kClosest(points, k);
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1]));

        int[][] result = new int[k][2];

        for (int[] point : points) {
            minHeap.offer(point);
        }

        int index = 0;
        while (index < k) {
            result[index] = minHeap.poll();
            index++;
        }
        return result;
    }

}
