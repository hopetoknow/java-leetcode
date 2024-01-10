package com.hopetoknow._0234_palindrome_linked_list;

import java.util.ArrayList;
import java.util.List;

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
        tempNode = head;

        for (int i = 0; i < nodeCounter; i++) {
            values[i] = tempNode.val;
            tempNode = tempNode.next;
        }

        for (int i = 0, j = nodeCounter - 1; i < nodeCounter / 2; i++, j--) {
            if (values[i] != values[j]) {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindrome2(ListNode head) {
        ListNode slow = head, fast = head, prev, temp;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        prev = slow;
        slow = slow.next;
        prev.next = null;

        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        fast = head;
        slow = prev;

        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }

            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }

    public boolean isPalindrome3(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        for (int i = 0, j = list.size() - 1; i < list.size() / 2; i++, j--) {
            if (!list.get(i).equals(list.get(j))) {
                return false;
            }
        }

        return true;
    }
}
