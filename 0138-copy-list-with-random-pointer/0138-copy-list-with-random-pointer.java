/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {

    // Not work with hashmap
    // public Node helperNode(Node head, Map<Node,Node>map)
    // {
    //     if(head == null) return head;
    //     Node newHead = new Node(head.val);
    //     map.put(head,newHead);
    //     newHead.next = helperNode(head,map);
    //     if(head.random != null)
    //     {
    //         newHead.random = map.get(head.random);
    //     }
    //     return newHead;
    // }

    public Node helperNode(Node head)
    {
        if(head == null) return head;

        //Step1 clone A to A`
        Node it = head;
        while(it != null)
        {
            Node clonedNode = new Node(it.val);
            clonedNode.next = it.next;
            it.next = clonedNode;
            it = it.next.next;
        }
        //Step2 Assign random links A` with the helper
        it = head;
        while(it != null)
        {
            Node cloneNode = it.next;
            cloneNode.random = it.random != null ? it.random.next : null;
            it = it.next.next;
        }

        //step3 Detach A` from A
        it = head;
        Node clonedHead = it.next;
        while(it!= null)
        {
            Node cloneNode = it.next;
            it.next = it.next.next;
            if(cloneNode.next != null)
            {
                cloneNode.next = cloneNode.next.next;
            } 
            it = it.next;  
        }
      return clonedHead;

    }
    public Node copyRandomList(Node head) {
        //Map<Node,Node> map = new HashMap<Node,Node>();
        return helperNode(head);
        
      
         

    }
}