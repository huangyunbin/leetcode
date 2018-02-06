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
        int innerLength = Math.min(length, 128);
        int start = 1;
        int max = 1;
        boolean skip = false;
        for (int i = 0; i < length; i++) {
            char value = charArr[i];
            if (skip) {
                if (value == charArr[start - 1]) {
                    skip = false;
                }
                continue;
            }

            for (int j = start; j < innerLength; j++) {
                if (value == charArr[j]) {
                    start = j + 1;
//                    max = Math.max(j - i + 1, max);
                    break;
                }
                if (unique(charArr, i, j)) {
                    max = Math.max(j - i + 1, max);
                } else {
                    start = j + 1;
                    skip = true;
                    break;
                }
            }
        }


        return max;
    }


}
