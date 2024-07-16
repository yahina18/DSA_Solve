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
        
        return helperIsPalindrome(head);
    }

    public ListNode reverseList(ListNode prev, ListNode curr)
	{
		if(curr == null)
			return prev;
				
		ListNode forward = curr.next;
		curr.next = prev;
		return reverseList(curr, forward);	
	}

    public boolean helperIsPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode mid = findMidNode(head);
        ListNode head2 = reverseList(null,mid.next);

        ListNode p1 = head;
        ListNode p2 = head2;

        while(p1 != null && p2 != null)
        {
        	if(p1.val != p2.val)
        		return false;
        	p1 = p1.next;
        	p2 = p2.next;
        }

        // Optional: Restore the list if needed
        // mid.next = reverseList(head2);

        return true;
    }
    
    public ListNode findMidNode(ListNode head)
    {
    	if(head == null)
    		return head;
    	
    	ListNode slow = head;
    	ListNode fast = head;
    	
    	while(fast.next != null)
    	{
    		fast = fast.next;
    		if(fast.next != null)
    		{
    			slow = slow.next;
    			fast = fast.next;
    		}
    		
    	}
    	return slow;
    }




}