package com.hopetoknow.from_2000_to_2499._2181_merge_nodes_in_betwee_zeros;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode current = head.next;
        ListNode newHead = null;
        ListNode newCurrent = null;
        int sum = 0;

        while (current != null) {
            if (current.val != 0) {
                sum += current.val;
            } else {
                ListNode sumNode = new ListNode(sum);
                sum = 0;
                if (newHead == null) {
                    newHead = sumNode;
                    newCurrent = sumNode;
                } else {
                    newCurrent.next = sumNode;
                    newCurrent = newCurrent.next;
                }
            }

            current = current.next;
        }

        return newHead;
    }
}
