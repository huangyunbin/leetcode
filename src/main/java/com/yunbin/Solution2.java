package com.yunbin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cloud.huang on 18/1/29.
 */
public class Solution2 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(5);
        List<Integer> list2 = Arrays.asList(5);
        new Solution2().addTwoNumbers(toListNode(list1), toListNode(list2));
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = reverse(l1);
        ListNode l4 = reverse(l2);
        ListNode result = new ListNode(0);
        ListNode tmp = result;
        int more = 0;
        while (l3 != null || l4 != null || more > 0) {
            int val = ((l3 == null ? 0 : l3.val) + (l4 == null ? 0 : l4.val) + more) % 10;
            more = ((l3 == null ? 0 : l3.val) + (l4 == null ? 0 : l4.val) + more) / 10;
            tmp.next = new ListNode(val);
            tmp = tmp.next;
            l3 = l3 == null || l3.next == null ? null : l3.next;
            l4 = l4 == null || l4.next == null ? null : l4.next;
        }

        return result.next;
    }


    public static ListNode reverse(ListNode listNode) {
        List<Integer> list = new ArrayList();
        while (listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }
        return toListNode(list);

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


/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
