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
        int[] array = merge(nums1, nums2);
        if (array.length % 2 == 1) {
            return array[array.length / 2];
        } else {
            return (array[array.length / 2 - 1] + array[array.length / 2]) / 2.0;
        }
    }

    private int[] merge(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            return nums2;
        }
        if (nums2.length == 0) {
            return nums1;
        }
        int[] array = new int[nums1.length + nums2.length];
        for (int i = 0, j = 0, k = 0; k < nums1.length + nums2.length; k++) {
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
        return array;
    }


}
