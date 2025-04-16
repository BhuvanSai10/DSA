package DSA.LinkedList;

import java.util.HashSet;
import java.util.Stack;

public class LinkedList {
    public static LLNode head;
    public static void insert(int data){
        LLNode newNode = new LLNode(data);
        if (head == null){
            head = newNode;
            return;
        }
        LLNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public static LLNode reverseList(LLNode head){
        if (head == null || head.next == null){
            return head;
        }
        LLNode prev = null;
        LLNode curr = head;
        LLNode next;
        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static LLNode reverseLLUsingStack(LLNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        Stack<LLNode> s = new Stack<>();
        LLNode temp = head;
        while (temp != null) {
            s.push(temp);
            temp = temp.next;
        }
        if (!s.isEmpty()) {
            head = s.pop();
            temp = head;
            while (!s.isEmpty()) {
                temp.next = s.pop();
                temp = temp.next;
            }
            temp.next = null;
        }
        return head;
    }
    public static void printMiddleNodeOfLL(LLNode head){
        LLNode sp = head;
        LLNode fp = head;
        while (fp!=null && fp.next!=null){
            sp = sp.next;
            fp = fp.next.next;
        }
        System.out.println("Middle element of the LIST is "+sp.data);
    }
    public static LLNode rotateLL(LLNode head,int k){
        if (head==null || head.next == null){
            return head;
        }
        LLNode curr = head;
        LLNode tail = head;
        int len = 1;
        while (tail.next!=null){
            tail = tail.next;
            len++;
        }
        int i = 0;
        while (i<(k%len)){
            tail.next = curr;
            tail = tail.next;
            curr = curr.next;
            tail.next = null;
            i++;
        }
        return curr;
    }
    public static LLNode rotateListLeft(LLNode head,int k){
        if (head==null || head.next == null){
            return head;
        }
        LLNode curr = head;
        LLNode tail = head;
        LLNode tailPrev = head;
        int len = 1;
        while (tail.next!=null){
            tailPrev = tail;
            tail = tail.next;
            len++;
        }
        int i = 0;
        while (i<(k%len)){
            tail.next = curr;
            curr = tail;
            tailPrev.next = null;

            while (tail.next!=null){
                tailPrev = tail;
                tail = tail.next;
            }
            i++;
        }
        return curr;
    }
    public static void nThNodeFromEndOfLL(LLNode head,int n){
        LLNode temp = head;
        int len = 0;
        while (temp!=null){
            len++;
            temp = temp.next;
        }
        if (n>len || n<=0){
            System.out.println("Out of bounds");
            return;
        }
        LLNode nThNode = head;
        for (int i = 0;i<(len-n);i++){
            nThNode = nThNode.next;
        }
        System.out.println(nThNode.data);
    }
    public static LLNode deleteLastOccurrenceOfAnItem(LLNode head,int key){
        LLNode last = null, lastPrev = null;
        LLNode curr = head, prev = null;

        while (curr != null) {
            if (curr.data == key) {
                lastPrev = prev;
                last = curr;
            }
            prev = curr;
            curr = curr.next;
        }
        if (last != null) {
            if (lastPrev != null) {
                lastPrev.next = last.next;
            } else {
                head = head.next;
            }
        }

        return head;
    }
    public static LLNode deleteMiddleOfTheLL(LLNode head){
        if (head==null || head.next==null){
            return null;
        }
        LLNode sp=head,fp=head;
        LLNode spPrev=null;
        while (fp!=null && fp.next!=null){
            spPrev = sp;
            sp = sp.next;
            fp = fp.next.next;
        }
        spPrev.next = sp.next;
        return head;
    }
    public static LLNode removeDuplicateElementsFromSortedList(LLNode head){
        LLNode current = head;
        while (current.next != null) {
            if (current.data == current.next.data)
                current.next = current.next.next;
            else
                current = current.next;
        }
        return head;
    }
    public static boolean detectLoop(LLNode head) {
        HashSet<LLNode> st = new HashSet<>();
        while (head != null) {
            if (st.contains(head))
                return true;

            st.add(head);
            head = head.next;
        }
        return false;
    }
    public static LLNode delete_N_NodesAfter_M_Nodes(LLNode head,int n,int m){
        if (m==0 || n==0 ){
            return head;
        }
        LLNode curr = head,prev = null;
        while (curr!=null){
            for (int i = 0 ; i<m ; i++){
                prev = curr;
                curr = curr.next;
                if (curr==null){
                    return head;
                }
            }
            for (int i =0 ; i<n ;i++){
                prev.next = curr.next;
                curr = curr.next;
                if (curr==null){
                    return head;
                }
            }
        }
        return head;
    }
    public static LLNode mergeAlternateNodesOfLL(LLNode head1,LLNode head2){
        LLNode temp1 = head1;
        LLNode temp2 = head2;

        while (temp1!=null && temp2!=null){
            LLNode ptr1 = temp1.next;
            LLNode ptr2 = temp2.next;

            temp2.next = temp1.next;
            temp1.next = temp2;

            temp1 = ptr1;
            temp2 = ptr2;
        }
        return head1;
    }
    public static void deleteNodeWithoutUsingHeadPointer(LLNode curr){
        if (curr==null){
            System.out.println("Provided node is empty");
            return;
        }
        if (curr.next == null){
            System.out.println("This is Last Node need head pointer to delete");
            return;
        }
        curr.data = curr.next.data;
        curr.next = curr.next.next;
    }
    public static LLNode deleteEveryKthNodeInLL(LLNode head, int k) {
        if (head == null || k <= 0) {
            return head;
        }
        if (k == 1) {
            return null;
        }
        LLNode curr = head;
        LLNode prev = null;
        int count = 0;
        while (curr != null) {
            count++;
            if (count % k == 0) {
                if (prev != null) {
                    prev.next = curr.next;
                } else {
                    head = curr.next;
                }
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
    public static void swapPairWiseElements(LLNode head){
        if (head==null || head.next == null){
            return;
        }
        LLNode curr = head;
        LLNode prev = null;
        while(curr.next!=null){
            prev = curr;
            curr = curr.next;
            int data = curr.data;
            curr.data = prev.data;
            prev.data = data;

            if (curr.next!=null){
                curr = curr.next;
            }
        }
    }
    public static int occurrenceOfAElementInLL(LLNode head,int element){
        LLNode temp = head;
        int count = 0;
        while (temp!=null){
            if (temp.data == element)
                count++;
            temp = temp.next;
        }
        return count;
    }
    public static LLNode sort0s1s2sInLL(LLNode head){
        if (head==null || head.next==null ){
            return head;
        }
        int[] cnt = {0,0,0};
        LLNode temp = head;
        while (temp!=null){
            cnt[temp.data] = cnt[temp.data] + 1;
            temp = temp.next;
        }
        temp = head;
        int index=0;
        while(temp!=null){
            if (cnt[index] == 0){
                index++;
            }
            else{
                temp.data = index;
                cnt[index]--;
                temp = temp.next;
            }
        }
        return head;
    }
    public static LLNode reverseLLInGivenGroupOfSizes(LLNode head,int[] groupSizes){
        if (head == null || head.next == null){
            return head;
        }
        LLNode curr = head;
        LLNode newHead = null;
        LLNode tail = null;
        int index = 0;
        while(curr!=null){
            LLNode groupHead = curr;
            LLNode prev= null;
            LLNode nextNode = null;
            int count = 0;

            while (count<groupSizes[index] && curr!=null){
                nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
                count++;
            }
            index++;

            if (newHead == null){
                newHead = prev;
            }

            if (tail!=null){
                tail.next = prev;
            }

            tail = groupHead;
        }
        return newHead;
    }
    public static LLNode mergeTwoSortedLL(LLNode head1,LLNode head2){
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        LLNode dummy = new LLNode(-1);
        LLNode tail = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        tail.next = (head1 != null) ? head1 : head2;

        return dummy.next;
    }
    public static boolean checkListIsPalindrome(LLNode head){
        if (head.next==null){
            return true;
        }
        LLNode curr = head;
        Stack<Integer> s = new Stack<>();
        while(curr!=null){
            s.push(curr.data);
            curr = curr.next;
        }
        while(head!=null){
            int data = s.pop();
            if (data!= head.data){
                return false;
            }
            head = head.next;
        }
        return s.isEmpty();

    }

    public static void display(LLNode head){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        LLNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static LLNode sumList(LLNode head1, LLNode head2){
        int carry = 0;
        LLNode dummyNode = new LLNode(-1);
        LLNode temp = dummyNode;

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
            temp.next = new LLNode(sum%10);
            carry = sum/10;

            temp = temp.next;
        }
        if (carry!=0){
            temp.next = new LLNode(carry);
        }
        return dummyNode.next;
    }

    public static LLNode segregateEvenAndOddNodes(LLNode head){
        if (head==null || head.next==null ){
            return head;
        }

        LLNode odd = head;
        LLNode evenHead = head.next, even = head.next;

        while (even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;

        }
        odd.next = evenHead;
        return head;

    }

    public static LLNode sort012s(LLNode head){
        LLNode zerosHead = new LLNode(-1);
        LLNode onesHead = new LLNode(-1);
        LLNode twosHead = new LLNode(-1);

        LLNode zeros = zerosHead;
        LLNode ones = onesHead;
        LLNode twos = twosHead;

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
    public static boolean isPalindromeList(LLNode head){
        if (head==null|| head.next ==null){
            return true;
        }
        LLNode fast = head,slow = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        LLNode revListHead = reverseList(slow.next);
        LLNode temp = head;
        while(temp!=null && revListHead!=null){
            if (temp.data!=revListHead.data){
                return false;
            }
            temp = temp.next;
            revListHead = revListHead.next;
        }
        return true;
    }


    public static void main(String[] args) {
//        isPalindromeList
//        insert(1);
//        insert(2);
//        insert(3);
//        insert(3);
//        insert(2);
//        insert(1);
//        System.out.println(isPalindromeList(head));

        //sort012s
//        insert(0);
//        insert(2);
//        insert(2);
//        insert(1);
//        insert(1);
//        insert(0);
//        insert(2);
//        display(sort012s(head));

        //segregateEvenAndOddNodes
//        insert(1);
//        insert(2);
//        insert(3);
//        insert(4);
//        insert(5);
//        insert(6);
//        display(head);
//        display(segregateEvenAndOddNodes(head));


        //For sumList
//        LLNode head1 = new LLNode(3);
//        head1.next = new LLNode(9);
//        head1.next.next = new LLNode(8);
//        System.out.print("List 1: ");
//        display(head1);
//
//        LLNode head2 = new LLNode(7);
//        head2.next = new LLNode(0);
//        head2.next.next = new LLNode(2);
//        System.out.print("List 2: ");
//        display(head2);
//
//        LLNode result = sumList(head1, head2);
//        System.out.print("Sum List: ");
//        display(reverseList(result));
//        insert(1);
//        insert(3);
//        insert(5);
//        insert(3);
//        insert(4);
//



//        display(rotateListLeft(head,3));

//        display(head);
//        System.out.println(checkListIsPalindrome(head));
//        LOOP DETECTION HARD CODED TO CREATE LOOP

//        LLNode head = new LLNode(1);
//        head.next = new LLNode(3);
//        head.next.next = new LLNode(4);
//
//        // Create a loop
//        head.next.next.next = head.next;
//
//        if (detectLoop(head))
//            System.out.println("true");
//        else
//            System.out.println("false");

        // MERGING a linked list into another linked list at alternate positions

//        LLNode head1 = head;
//        LLNode head2 = new LLNode(10);
//        head2.next = new LLNode(20);
//        head2.next.next = new LLNode(30);
//        head2.next.next.next = new LLNode(40);
//        display(mergeAlternateNodesOfLL(head1,head2));

        // DELETION OF NODE WITHOUT USING HEAD POINTER

//        head = new LLNode(10);
//        head.next = new LLNode(20);
//        head.next.next = new LLNode(30);
//        head.next.next.next = new LLNode(40);
//        display(head);
//
//        deleteNodeWithoutUsingHeadPointer(head.next);
//        display(head);

        // MERGING TWO SORTED LIST
        // LLNode head1 = head;
//        System.out.println("List 1");
//        display(head1);
//        LLNode head2 = new LLNode(5);
//        head2.next = new LLNode(10);
//        head2.next.next = new LLNode(15);
//        head2.next.next.next = new LLNode(40);
//        System.out.println("List 2");
//        display(head2);
//
//        System.out.println("Lists after merging");
//        display(mergeTwoSortedLL(head1,head2));
    }
}
