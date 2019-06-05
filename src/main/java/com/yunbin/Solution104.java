package com.yunbin;

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
            return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
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
