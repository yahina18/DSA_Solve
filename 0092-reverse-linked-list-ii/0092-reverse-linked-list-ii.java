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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(head == null )
			return null;
		
		
		if(left == right)
			return head;
		
		ListNode leftNode =  findNthNode(head, left-1);
		ListNode rightNode = findNthNode(head, right);
		//System.out.println("Left Node Part Value : "+leftNode.data);
		
		ListNode rightPart = rightNode.next;
		//System.out.println("Right Node Part value : "+rightPart.data);
		
		ListNode prev = null;
		ListNode curr = left == 1 ? leftNode : leftNode.next;
		int tempLeft = left;
		while(curr != null && left <= right)
		{ 
			ListNode forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
			
			left++;
		}
		
        if(tempLeft == 1)
          head = prev;
        else
           leftNode.next = prev;
        
        ListNode temp = leftNode;
			
			while(temp.next != null)
			{   
				//System.out.print("Temp data "+temp.data+" ");
				temp = temp.next;
			}
			temp.next = rightPart;


		return head;    
    }

    public ListNode findNthNode(ListNode node , int n)
	{
		if(node == null)
			return null;
		
		ListNode temp = node;
		int count = 0;
		
		while(count < n-1)
		{
			temp = temp.next;
			count++;
		}
		return temp;
		
	}
}