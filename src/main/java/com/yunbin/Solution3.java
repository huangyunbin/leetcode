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
        char[] charArr = s.toCharArray();
        if (charArr.length <= 1) {
            return charArr.length;
        }
        int result = 0;
        for (int i = 0; i < charArr.length; i++) {
            char c = charArr[i];
            inner:
            for (int j = i + 1; j < charArr.length; j++) {
                char tmp = charArr[j];
                if (c == tmp) {
                    result = Math.max(result, j + 1 - i);
                    break inner;
                }
                result = Math.max(result, j + 1 - i);
            }
        }
        return result;
    }



}
