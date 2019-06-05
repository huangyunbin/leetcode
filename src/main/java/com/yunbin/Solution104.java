package com.yunbin;

import java.util.Stack;

/**
 * Created by cloud.huang on 2019/6/5.
 * <p>
 * Example:
 * <p>
 * Given binary tree [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its depth = 3.
 */
public class Solution104 {
    
    
    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int max = 1;
            Stack<TreeNode> nodeStack = new Stack<>();
            Stack<Integer> valueStack = new Stack<>();
            nodeStack.push(root);
            valueStack.push(1);
            while (!nodeStack.isEmpty()) {
                TreeNode node = nodeStack.pop();
                int high = valueStack.pop();
                max = Math.max(high, max);
                if (node.left != null) {
                    nodeStack.push(node.left);
                    valueStack.push(high + 1);
                }
                if (node.right != null) {
                    nodeStack.push(node.right);
                    valueStack.push(high + 1);
                }
            }
            return max;
        }
    }
    
    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int x) {
            val = x;
        }
    }
}
