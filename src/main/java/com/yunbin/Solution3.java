package com.yunbin;

/**
 * Created by cloud.huang on 18/2/3.
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Examples:
 * <p>
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * <p>
 * Given "bbbbb", the answer is "b", with the length of 1.
 * <p>
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Solution3 {


    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if (length <= 1) {
            return length;
        }
        int[] index = new int[128];
        index[s.charAt(0)] = 1;
        int max = 1;

        int i = 0;
        for (int j = 1; j < length; j++) {
            char value = s.charAt(j);
            i = Math.max(index[value], i);
            max = Math.max(j - i + 1, max);
            index[value] = j + 1;
        }

        return max;
    }


}
