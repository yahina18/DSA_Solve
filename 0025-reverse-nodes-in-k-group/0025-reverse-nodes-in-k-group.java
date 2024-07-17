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
    public ListNode reverseKGroup(ListNode head, int k) {
        return kGroupReverse(head,k);
    }

    public ListNode kGroupReverse(ListNode head, int k) {
		
		//System.out.println("Value of k "+k);
		
		if (head == null)
			return head;

		int len = getlengthLL(head);
		
		if (len < k)
			return head;

		ListNode prev = null;
		ListNode curr = head;
		ListNode forward = curr.next;
		int count = 0;

		while (count < k) {
			forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
			count++;

		}

	    if(forward != null) {
			head.next = kGroupReverse(forward, k);
		}

		return prev;

	}
    
    public int getlengthLL(ListNode node)
    {
        ListNode temp = node;
		int len = 0;
		while (temp != null) {
			temp = temp.next;
			len++;

		}
		return len;
    }



}