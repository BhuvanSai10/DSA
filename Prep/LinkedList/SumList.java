package DSA.Prep.LinkedList;

public class SumList {
    public static ListNode sumList(ListNode head1, ListNode head2){
        int carry = 0;
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        while (head1!=null || head2!=null){
            int sum = carry;
            if (head1!=null){
                sum = sum + head1.data;
                head1 = head1.next;
            }
            if (head2!=null){
                sum = sum + head2.data;
                head2 = head2.next;
            }
            temp.next = new ListNode(sum%10);
            carry = sum/10;

            temp = temp.next;
        }
        if (carry!=0){
            temp.next = new ListNode(carry);
        }
        return dummyNode.next;
    }
}
