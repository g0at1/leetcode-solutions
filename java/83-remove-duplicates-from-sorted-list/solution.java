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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tmp = head;

        while (tmp != null && tmp.next != null) {
            if (tmp.next.val == tmp.val) {
                tmp.next = tmp.next.next;
                continue;
            }

            tmp = tmp.next;
        }

        return head;
    }
}
