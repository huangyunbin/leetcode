package com.yunbin;

import java.util.Arrays;

/**
 * Created by cloud.huang on 18/2/7.
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * <p>
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * <p>
 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * The median is 2.0
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * The median is (2 + 3)/2 = 2.5
 */
public class Solution4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = concat(nums1, nums2);
        Arrays.sort(array);
        if (array.length == 1) {
            return array[0];
        }
        if (array.length % 2 == 1) {
            return array[array.length / 2 ];
        } else {
            return (array[array.length / 2-1] + array[array.length / 2 ]) / 2.0;
        }
    }

    public static int[] concat(int[] first, int[] second) {
        int[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }
}
