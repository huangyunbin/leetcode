package com.yunbin;

import java.util.PriorityQueue;

/**
 * Created by cloud.huang on 2019/6/8.
 * <p>
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order,
 * not the kth distinct element.
 * <p>
 * Example 1:
 * <p>
 * Input: [3,2,1,5,6,4] and k = 2
 * Output: 5
 * Example 2:
 * <p>
 * Input: [3,2,3,1,2,4,5,5,6] and k = 4
 * Output: 4
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ array's length.
 * <p>
 * <p>
 * 取第k大个数
 */
public class Solution215 {
    
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (k < 0 || k > nums.length) {
            return -1;
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        for (int i = 0; i < nums.length; i++) {
            priorityQueue.add(nums[i]);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        return priorityQueue.poll();
    }
    
    
}
