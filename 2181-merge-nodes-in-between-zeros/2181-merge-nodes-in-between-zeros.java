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
        ListNode result = new ListNode(0);
        ListNode resultTail = result;
        ListNode curr = head.next;
        int sum = 0;

        while (curr != null) {
            if (curr.val != 0) {
                sum += curr.val;
            } else {
                resultTail.next = new ListNode(sum);
                resultTail = resultTail.next;
                sum = 0;
            }
            curr = curr.next;
        }

        return result.next;
    }
}