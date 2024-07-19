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
    public ListNode rotateRight(ListNode head, int k) {
        
       if (k == 0)
			return head;
       
       int len = getlengthLL(head);

       if(len == 0)
           return head;   

       if(len == 1) 
           return head;

		else {
			
			//System.out.println("Length : "+len);
			
			int actualKValue = k % len;
			
			//System.out.println("Actual K value : "+actualKValue);
			
			int lastNodePos = len - actualKValue -1;
			
			//System.out.println("LastNodePos : "+lastNodePos);
			
			ListNode newLastNode = head;
			
			for(int i = 1; i <= lastNodePos; i++)
				newLastNode = newLastNode.next;
			
			//System.out.println("Value : "+newLastNode.data);
			
			ListNode newHead = newLastNode.next;
			//System.out.println("New Head value : "+newHead.data);
			newLastNode.next = null;
			
			
			if(newHead!= null)
			{
				newLastNode.next = null;
				
				ListNode temp = newHead;
				while(temp!= null && temp.next!= null)
				{
					temp = temp.next;
				}
			
				temp.next = head;
				return newHead;
			}
			else {
				return head;
			}
			
			
		}
        
    }

    public int getlengthLL(ListNode head) {
		ListNode temp = head;
		int len = 0;
		while (temp != null) {
			temp = temp.next;
			len++;

		}
		return len;
	}
}