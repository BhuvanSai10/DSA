package DSA.Ultimate;

import DSA.Prep.LinkedList.ListNode;

public class MergeTwoSortedList15 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1); // Dummy head
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        current.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }
    public static void main(String[] args) {

    }
}
