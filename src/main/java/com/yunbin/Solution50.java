package com.yunbin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cloud.huang on 2019/6/10.
 * <p>
 * Given a collection of intervals, merge all overlapping intervals.
 * <p>
 * Example 1:
 * <p>
 * Input: [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 * Example 2:
 * <p>
 * Input: [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 * <p>
 * 合并数组
 */
public class Solution50 {
    
    
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        
        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        int[] begain = intervals[0];
        List<int[]> res = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            if (begain[1] < intervals[i][0]) {
                res.add(begain);
                begain = intervals[i];
            } else {
                begain[1] = Math.max(begain[1], intervals[i][1]);
            }
            if (i == intervals.length - 1) {
                res.add(begain);
            }
        }
        
        return res.toArray(new int[res.size()][]);
    }
    
    
}
