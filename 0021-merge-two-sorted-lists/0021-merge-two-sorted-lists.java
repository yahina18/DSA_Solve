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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        return mergeTwoSort(list1,list2);

    }

    public ListNode mergeTwoSort(ListNode head1 , ListNode head2)
	{
		ListNode finalHead = new ListNode(0);
		ListNode finalTail = finalHead;
		
		while(head1 != null && head2 != null)
		{
			//same data add both list data into final list.
			if(head1.val == head2.val)
			{
				ListNode temp = head1;
				head1 = head1.next;
				temp.next = null;
				
				
				finalTail.next = temp;
				finalTail = temp;
				
				
				temp = head2;
				head2 = head2.next;
				temp.next = null;
				
				finalTail.next = temp;
				finalTail = temp;
				
				/*
				 * head1 = head1 != null ? head1.next : null; head2 = head2 != null ? head2.next
				 * : null;
				 */
				
				
			}
			else if(head1.val < head2.val)
			{
				//System.out.println("True!!! ");
				ListNode temp = head1;
				head1 = head1.next;
				temp.next = null;
				
				
				finalTail.next = temp;
				finalTail = temp;
				
				//head1 = head1 != null ? head1.next : null;
				
			}else {
				
				//System.out.println("True!!! ");
				ListNode temp = head2;
				head2 = head2.next;
				temp.next = null;
				
				
				finalTail.next = temp;
				finalTail = temp;
				
				//head2 = head2 != null ? head2.next : null ;
				
			}
			
			
		}
		while(head1 != null)
		{
			ListNode temp = head1;
			head1 = head1.next;
			temp.next = null;
			
			
			finalTail.next = temp;
			finalTail = temp;
				
		}
		
		while(head2 != null)
		{
			ListNode temp = head2;
			head2 = head2.next;
			temp.next = null;
			
			
			finalTail.next = temp;
			finalTail = temp;
			
		}
		
		
		
		return finalHead.next;
			
		
		
	}



}