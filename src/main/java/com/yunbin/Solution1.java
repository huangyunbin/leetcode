package com.yunbin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by cloud.huang on 18/1/11.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class Solution1 {


    public static void main(String[] args) {
        int[] result = new Solution1().twoSum(new int[]{3, 2, 4}, 6);
        System.out.println(Arrays.toString(result));
    }


    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");


    }
}
