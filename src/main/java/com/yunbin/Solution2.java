package com.yunbin;

/**
 * Created by cloud.huang on 18/1/29.
 */
public class Solution2 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode tmp = result;
        int more = 0;
        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int val = (val1 + val2 + more) % 10;
            more = (val1 + val2 + more) / 10;
            tmp.next = new ListNode(val);
            tmp = tmp.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

        }
        if (more > 0) {
            tmp.next = new ListNode(more);
        }

        return result.next;
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
