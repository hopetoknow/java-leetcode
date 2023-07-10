package com.hopetoknow.easy._234_palindrome_linked_list;

import java.util.Arrays;

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
    public boolean isPalindrome(ListNode head) {
        int nodeCounter = 0;
        ListNode tempNode = head;

        while (tempNode != null) {
            nodeCounter++;
            tempNode = tempNode.next;
        }

        if (nodeCounter == 1) {
            return true;
        }

        int[] values = new int[nodeCounter];
        int[] reversedValues = new int[nodeCounter];
        tempNode = head;

        for (int i = 0; i < nodeCounter; i++) {
            values[i] = tempNode.val;
            tempNode = tempNode.next;
        }

        for (int i = 0, j = nodeCounter - 1; i < nodeCounter; i++, j--) {
            reversedValues[i] = values[j];
        }

        return Arrays.equals(values, reversedValues);
    }
}
