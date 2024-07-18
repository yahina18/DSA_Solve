/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode a = headA;
        ListNode b = headB;
        //first travel on both list to know which list is bigger.
        while(a!= null && b!= null)
        {
            a = a.next;
            b = b.next;
        }
         
         int blen = 0;
         int alen = 0;

        if(a == null)
        {   
            while(b != null)
            {
                b = b.next;
                blen++;
            }
        }else{
              
            while(a!= null)
            {
                a = a.next;
                alen++;
            }

        }

        while(blen > 0)
        {
            headB = headB.next;
            blen--;
        }
        while(alen > 0)
        {
            headA = headA.next;
            alen--;
        }

        while(headA!= headB)
        {
            headA = headA.next;
            headB = headB.next;
        }
       return headA;
        
    }
}