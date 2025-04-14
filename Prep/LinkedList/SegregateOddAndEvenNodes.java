package DSA.Prep.LinkedList;

public class SegregateOddAndEvenNodes {
    public static ListNode segregateEvenAndOddNodes(ListNode head){
        if (head==null || head.next==null ){
            return head;
        }

        ListNode odd = head;
        ListNode evenHead = head.next, even = head.next;

        while (even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;

        }
        odd.next = evenHead;
        return head;

    }
}
