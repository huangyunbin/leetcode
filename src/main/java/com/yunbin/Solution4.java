package com.yunbin;

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
        int totalSize = nums1.length + nums2.length;
        int middle1 = (totalSize / 2) - 1;
        int middle2 = totalSize / 2;
        if (totalSize % 2 == 1) {
            middle1 = totalSize / 2;
        }
        int[] array = new int[middle2 + 1];
        for (int i = 0, j = 0, k = 0; k < middle2 + 1; k++) {
            if (i == nums1.length) {
                array[k] = nums2[j];
                j++;
                continue;
            }

            if (j == nums2.length) {
                array[k] = nums1[i];
                i++;
                continue;
            }

            if (nums1[i] < nums2[j]) {
                array[k] = nums1[i];
                i++;
            } else {
                array[k] = nums2[j];
                j++;
            }
        }
        return (array[middle1] + array[middle2]) / 2.0;

    }
}