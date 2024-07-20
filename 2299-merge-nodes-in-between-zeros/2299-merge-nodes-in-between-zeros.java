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
        if(head==null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode newLastNode = null;
        int sum = 0;
        while(fast!= null)
        {
            if(fast.val != 0)
            {
                sum += fast.val;
            }else{
                slow.val = sum;
                newLastNode = slow;
                slow = slow.next;
                sum = 0;
            }
            fast = fast.next;
        }
        newLastNode.next = null;
        return head;

    }
}