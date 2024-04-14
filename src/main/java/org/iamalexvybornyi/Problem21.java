package org.iamalexvybornyi;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * <p>
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Return the head of the merged linked list.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Example 2:
 * <p>
 * Input: list1 = [], list2 = []
 * Output: []
 * Example 3:
 * <p>
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order.
 */
public class Problem21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null && list2 != null) {
            return list2;
        } else if (list1 != null && list2 == null) {
            return list1;
        }

        ListNode output = new ListNode();
        ListNode currentNode = output;

        Integer list1CurrentValue = list1.val;
        Integer list2CurrentValue = list2.val;
        boolean list1End = false;
        boolean list2End = false;

        while (!list1End || !list2End) {
            if ((list1CurrentValue <= list2CurrentValue || list2End) && !list1End) {
                // Add a list 1 item into the output list
                currentNode.next = new ListNode(list1CurrentValue);
                currentNode = currentNode.next;
                list1 = list1.next;
                if (list1 != null) {
                    list1CurrentValue = list1.val;
                } else {
                    list1CurrentValue = Integer.MIN_VALUE;
                    list1End = true;
                }
            } else {
                // Add a list 2 item into the output list
                currentNode.next = new ListNode(list2CurrentValue);
                currentNode = currentNode.next;
                list2 = list2.next;
                if (list2 != null) {
                    list2CurrentValue = list2.val;
                } else {
                    list2CurrentValue = Integer.MIN_VALUE;
                    list2End = true;
                }
            }
        }

        return output.next;
    }

    @EqualsAndHashCode
    @ToString
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
