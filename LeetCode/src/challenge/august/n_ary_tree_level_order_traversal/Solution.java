package challenge.august.n_ary_tree_level_order_traversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * About
 *
 * Date  : 2021-08-12
 * URL   : https://leetcode.com/explore/challenge/card/august-leetcoding-challenge-2021/613/week-1-august-1st-august-7th/3871/
 *
 */

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class Solution {
    private final List<List<Integer>> answer = new ArrayList<>();

    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) return answer;
        traversal(Arrays.asList(root));
        return answer;
    }

    public void traversal(List<Node> currentNode) {
        if (currentNode.isEmpty()) return;

        List<Integer> currentLevel = new ArrayList<>();
        List<Node> nextLevelNode = new ArrayList<>();

        for (Node node: currentNode) {
            currentLevel.add(node.val);
            for (Node child: node.children) {
                nextLevelNode.add(child);
            }
        }
        answer.add(currentLevel);
        traversal(nextLevelNode);
    }
}
