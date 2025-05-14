package DSA.Ultimate;

import DSA.STS.Node;

public class ReverseLinkedList7 {
    public Node reverseList(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node prev = null;
        Node curr = head;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
