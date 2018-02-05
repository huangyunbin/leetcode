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


    public boolean unique(char[] charArr, int start, int end) {
        char[] array = new char[128];
        for (int i = start; i <= end; i++) {
            char value = charArr[i];
            if (++array[value] > 1) {
                return false;
            }
        }

        return true;
    }

    public int lengthOfLongestSubstring(String s) {
        char[] charArr = s.toCharArray();
        if (charArr.length <= 1) {
            return charArr.length;
        }

        int length = s.length();
        int max = 1;
        for (int i = 0; i < length; i++) {
            char value = s.charAt(i);
            int jlength = Math.min(length, 128);
            for (int j = i + 1; j < jlength; j++) {
                if (value == s.charAt(j)) {
                    break;
                }
                if (unique(charArr, i, j)) {
                    max = Math.max(j - i + 1, max);
                } else {
                    break;
                }
            }
        }


        return max;
    }


}
