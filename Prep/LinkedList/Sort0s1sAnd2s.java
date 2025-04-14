package DSA.Prep.LinkedList;

public class Sort0s1sAnd2s {
    public static ListNode sort012s(ListNode head){
        ListNode zerosHead = new ListNode(-1);
        ListNode onesHead = new ListNode(-1);
        ListNode twosHead = new ListNode(-1);

        ListNode zeros = zerosHead;
        ListNode ones = onesHead;
        ListNode twos = twosHead;

        while (head!=null){
            if (head.data==0){
                zeros.next = head;
                zeros = zeros.next;
            }else if (head.data == 1){
                ones.next = head;
                ones = ones.next;
            }else{
                twos.next = head;
                twos = twos.next;
            }
            head = head.next;
        }

        twos.next = null;
        ones.next = twosHead.next;
        zeros.next = onesHead.next;


        return zerosHead.next;
    }

}
