package com.hopetoknow.from_2500_to_2999._2807_insert_greatest_common_divisors_in_linked_list;

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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current = head;

        while (current.next != null) {
            int gcd = gcd(current.val, current.next.val);
            ListNode gcdNode = new ListNode(gcd, current.next);
            current.next = gcdNode;
            current = gcdNode.next;
        }

        return head;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
