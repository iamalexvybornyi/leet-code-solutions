package org.iamalexvybornyi;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 *
 *
 * Example 1:
 * <p>
 *
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * Example 2:
 * <p>
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 * <p>
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 * <p>
 *
 * Constraints:
 * <p>
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 */
public class Problem2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode(0);
        ListNode currentNode = resultNode, l1Copy = l1, l2Copy = l2;
        int additionalVal = 0;

        while (l1Copy != null || l2Copy != null) {
            l1Copy = l1Copy != null ? l1Copy : new ListNode(0);
            l2Copy = l2Copy != null ? l2Copy : new ListNode(0);

            int sum = l1Copy.val + l2Copy.val + additionalVal;
            int res = sum % 10;
            additionalVal = sum / 10;
            currentNode.next = new ListNode(res);
            currentNode = currentNode.next;

            l1Copy = l1Copy.next;
            l2Copy = l2Copy.next;
        }

        if (additionalVal > 0) {
            currentNode.next = new ListNode(additionalVal);
        }

        return resultNode.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
