package DSA.STS;

// Java program to sort bitonic DLL.

class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

public class SortBiotonicDLL {
    static void printList(DLLNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Function to sort the doubly linked list
    static DLLNode sortBiotonicDLL(DLLNode head) {
        if (head == null || head.next == null) return head;

        // Find the last DLLNode
        DLLNode last = head;
        while (last.next != null) {
            last = last.next;
        }

        // Initialize pointers
        DLLNode front = head;
        DLLNode result = null;
        DLLNode tail = null;

        // Process DLLNodes until all are added to the
        // result list
        while (front != null && last != null && front != last
                && last.next != front) {
            DLLNode newDLLNode;

            // Compare the value of the front and last DLLNodes
            if (front.data < last.data) {
                newDLLNode = new DLLNode(front.data);
                front = front.next;
            } else {
                newDLLNode = new DLLNode(last.data);
                last = last.prev;
            }

            // Add the new DLLNode to the result list
            if (result == null) {
                result = newDLLNode;
                tail = result;
            } else {
                tail.next = newDLLNode;
                newDLLNode.prev = tail;
                tail = tail.next;
            }
        }

        // Handle the case where front and last pointers
        // meet or cross
        while (front != null && front != last.next) {
            DLLNode newDLLNode = new DLLNode(front.data);
            front = front.next;
            tail.next = newDLLNode;
            newDLLNode.prev = tail;
            tail = tail.next;
        }

        while (last != null && last.next != front) {
            DLLNode newDLLNode = new DLLNode(last.data);
            last = last.prev;
            tail.next = newDLLNode;
            newDLLNode.prev = tail;
            tail = tail.next;
        }

        return result;
    }

    public static void main(String[] args) {

        // Create the doubly linked list: 2<->12<->11<->1
        DLLNode head = new DLLNode(2);
        head.next = new DLLNode(12);
        head.next.prev = head;
        head.next.next = new DLLNode(11);
        head.next.next.prev = head.next;
        head.next.next.next = new DLLNode(1);
        head.next.next.next.prev = head.next.next;

        DLLNode sortedHead = sortBiotonicDLL(head);
        printList(sortedHead);
    }
}

