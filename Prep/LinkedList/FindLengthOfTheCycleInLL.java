package DSA.Prep.LinkedList;

public class FindLengthOfTheCycleInLL {
    static int findLength(ListNode slow, ListNode fast){

        // count to keep track of
        // ListNodes encountered in loop
        int cnt = 1;

        // move fast by one step
        fast = fast.next;

        // traverse fast till it
        // reaches back to slow
        while(slow!=fast){

            // at each ListNode increase
            // count by 1 and move fast
            // forward by one step
            cnt++;
            fast = fast.next;
        }

        // loop terminates when fast reaches
        // slow again and the count is returned
        return cnt;
    }

    // Function to find the length
    // of the loop in a linked list
    static int lengthOfLoop(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Traverse the list to detect a loop
        while (fast != null && fast.next != null) {
            // Move slow one step
            slow = slow.next;

            // Move fast two steps
            fast = fast.next.next;

            // Step 2: If the slow and fast
            // pointers meet, there is a loop
            if (slow == fast) {
                return findLength(slow, fast);
            }
        }

        // Step 3: If the fast pointer reaches the end
        // there is no loop

        return 0;
    }
}
