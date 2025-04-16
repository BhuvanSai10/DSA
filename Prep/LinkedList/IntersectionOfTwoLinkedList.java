package DSA.Prep.LinkedList;

public class IntersectionOfTwoLinkedList {
    static ListNode intersectionPresent(ListNode head1,ListNode head2) {
        ListNode d1 = head1;
        ListNode d2 = head2;

        while(d1 != d2) {
            d1 = d1 == null? head2:d1.next;
            d2 = d2 == null? head1:d2.next;
        }

        return d1;
    }

}
