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
    byte[] tmp = new byte[128];
    
    public String longestPalindrome(String s) {
        int length = s.length();
        if (s.length() <= 1) {
            return s;
        }
        char[] array = s.toCharArray();
        int target[] = new int[]{0, 0};
        for (int i = 0; i < length; i++) {
            if (notPalindrome(i, array)) {
                continue;
            }
            int tmp[] = getPos(i, array);
            if (tmp[1] - tmp[0] > target[1] - target[0]) {
                target = tmp;
            }
        }
        
        
        return s.substring(target[0], target[1] + 1);
    }
    
    private boolean notPalindrome(int j, char[] array) {
        for (int i = j; i < array.length; i++) {
            tmp[array[i]] = 1;
        }
        int total = 0;
        for (int i = 65; i < 97; i++) {
            if (tmp[i] == 1) {
                total++;
                tmp[i] = 0;
            }
        }
        return total - 1 > array.length / 2;
    }
    
    private int[] getPos(int i, char[] array) {
        int start = i;
        int endMax = array.length - 1;
        int end = endMax;
        
        for (; start < array.length && end > i; ) {
            if (array[start] == array[end]) {
                if (end - start <= 2) {
                    break;
                }
                
                start++;
                end--;
                
            } else {
                start = i;
                endMax--;
                end = endMax;
            }
        }
        
        end = end + (start - i);
        return new int[]{i, end};
    }
    
    
}
