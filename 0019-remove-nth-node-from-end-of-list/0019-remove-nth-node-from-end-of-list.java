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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        return removeNthNode(head,n);
    }

    public ListNode removeNthNode(ListNode head, int n)
	{
		// 1 - 2 - 3 - 4 - 5
        // 5 - 4 - 3 - 2 - 1

        if(head == null)
           return null;

        // check len its possible to remove nth node..
        int len = getLength(head);
        if(len < n)
            return head;

		head = reverseList(null, head);
		
		ListNode prev = null;
		ListNode curr = head;
		int count = 0;
		while(count < n-1 && curr != null)
		{
			prev = curr;
			curr = curr != null ? curr.next : null;
			count++;
			
		}
		if(prev == null)
		{
			ListNode temp = curr;
			curr = curr.next;
			head = curr;
			temp.next = null;
			
		}
		else if(curr != null) {
			prev.next = curr.next;
			curr.next = null;
		}
				
		head = reverseList(null, head);
		return head;
		
	}
    
    public int getLength(ListNode head)
    {
        ListNode temp = head;
        int len = 0;
        while(temp != null)
        {
            temp = temp.next;
            len++;
        }
        return len;
    }

    public ListNode reverseList(ListNode prev, ListNode curr)
    {
        
        while(curr != null )
        {
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;

    }


}