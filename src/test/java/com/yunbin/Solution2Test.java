package com.yunbin;

import java.util.Arrays;
import java.util.List;

/**
 * Created by cloud.huang on 18/1/29.
 */
public class Solution2Test {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(8, 1);
        List<Integer> list2 = Arrays.asList(5);
        new Solution2().addTwoNumbers(toListNode(list1), toListNode(list2));
    }


    public static ListNode toListNode(List<Integer> list) {
        ListNode result = new ListNode(list.get(0));
        ListNode tmp = result;
        for (int i = 1; i < list.size(); i++) {
            tmp.next = new ListNode(list.get(i));
            tmp = tmp.next;

        }
        return result;
    }


}
