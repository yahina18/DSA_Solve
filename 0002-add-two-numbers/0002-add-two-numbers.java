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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        return helperAddTwoNumbers(l1,l2);

    }

    // public ListNode reverseList(ListNode prev, ListNode curr)
	// {
	// 	if(curr == null)
	// 		return prev;
		
		
	// 	ListNode forward = curr.next;
	// 	curr.next = prev;
	// 	return reverseList(curr, forward);
			
		
	// }

    public ListNode helperAddTwoNumbers(ListNode head1, ListNode head2)  // 2 4 3            5  6 4
    {
    	
    	
    	ListNode ansHead = new ListNode(-1);
    	ListNode ansTail = ansHead;
    	int carry = 0;
    	while(head1 != null || head2 != null || carry != 0)
    	{
    		//System.out.println(head1.data+" "+head2.data);
            int digit1 = head1 != null ? head1.val : 0;
            int digit2 = head2 != null ? head2.val : 0;
    		int sum = digit1 + digit2 + carry;
    		int digit = sum % 10;
    		carry = sum / 10;
    		
    		
    		ListNode node = new ListNode(digit);
    		ansTail.next = node;
    		ansTail = node;
    		
    		head1 = head1 != null ? head1.next : null;
    		head2 = head2 != null ? head2.next : null;
    		
    	}	
    	return ansHead.next;
    	
    }


}