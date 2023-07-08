package com.hopetoknow.easy._234_palindrome_linked_list;

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

        ListNode middleNode = head;

        for (int i = 0; i < nodeCounter / 2; i++) {
            middleNode = middleNode.next;
        }

        tempNode = head;
        ListNode prevTempNode = head;
        int sum = 0;
        boolean tempNodeAndAfterIt = false;

        for (int i = 0; i < nodeCounter; i++) {
            if (!tempNodeAndAfterIt) {
                sum += tempNode.val;
            } else {
                sum -= tempNode.val;
            }

            if (middleNode.equals(tempNode.next)) {
                if (nodeCounter % 2 == 1) {
                    sum += middleNode.val;

                    if (tempNode.val != middleNode.next.val) {
                        return false;
                    }
                } else {
                    if (tempNode.val != middleNode.val) {
                        return false;
                    }
                    if (middleNode.next != null && prevTempNode.val != middleNode.next.val) {
                        return false;
                    }
                }

                tempNodeAndAfterIt = true;
            }

            prevTempNode = tempNode;
            tempNode = tempNode.next;
        }

        return sum == 0;
    }
}
