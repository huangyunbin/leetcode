package com.yunbin;

/**
 * Created by cloud.huang on 18/2/22.
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum
 * length of s is 1000.
 * <p>
 * Example:
 * <p>
 * Input: "babad"
 * <p>
 * Output: "bab"
 * <p>
 * Note: "aba" is also a valid answer.
 * <p>
 * <p>
 * Example:
 * <p>
 * Input: "cbbd"
 * <p>
 * Output: "bb"
 */
public class Solution5 {
    
    public String longestPalindrome(String s) {
        int length = s.length();
        if (s.length() <= 1) {
            return s;
        }
        char[] array = s.toCharArray();
        int target[] = new int[]{0, 0};
        for (int i = 0; i < length; i++) {
            int tmp[] = getPos(i, array);
            if (tmp[1] - tmp[0] > target[1] - target[0]) {
                target = tmp;
            }
        }
        
        
        return s.substring(target[0], target[1] + 1);
    }
    
    private int[] getPos(int i, char[] array) {
        int start = i;
        int end = array.length - 1;
        
        for (; start < array.length && end > i; ) {
            if (array[start] == array[end]) {
                if (end - start <= 2) {
                    break;
                }
                
                start++;
                end--;
                
            } else {
                start = i;
                end--;
            }
        }
        
        end = end + (start - i);
        return new int[]{i, end};
    }
    
    
}
