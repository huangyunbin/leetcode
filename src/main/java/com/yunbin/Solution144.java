package com.yunbin;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by cloud.huang on 2019/6/5.
 * <p>
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * <p>
 * Example:
 * <p>
 * Input: [1,null,2,3]
 * 1
 * \
 * 2
 * /
 * 3
 * <p>
 * Output: [1,2,3]
 * <p>
 * 前序遍历
 */
public class Solution144 {
    
    public List<Integer> preorderTraversal(TreeNode node) {
        List<Integer> list = new LinkedList<>();
        if (node == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (node != null) {
            list.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            node = node.left;
            if (node == null && !stack.isEmpty()) {
                node = stack.pop();
            }
        }
        return list;
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


