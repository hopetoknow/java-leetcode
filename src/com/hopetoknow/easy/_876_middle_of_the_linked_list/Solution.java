package com.hopetoknow.easy._876_middle_of_the_linked_list;

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
    public static ListNode middleNode(ListNode head) {
        int nodeCounter = 0;
        ListNode tempNode = head;

        while (tempNode != null) {
            nodeCounter++;
            tempNode = tempNode.next;
        }

        tempNode = head;

        for (int i = 0; i < nodeCounter / 2; i++) {
            tempNode = tempNode.next;
        }

        return tempNode;
    }
}
