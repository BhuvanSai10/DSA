class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoubleLinkedList {
    static Node head ;
    public static Node insertAtFirst(Node head,int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return head;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return head;
    }
    public static Node insertAtLast(Node head, int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }
    public static Node insertAtGivenPosition(Node head, int data, int pos) {
        if (pos <= 0) {
            System.out.println("Invalid position. Must be 1 or greater.");
            return head;
        }
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            return newNode;
        }
        Node curr = head;
        int i = 1;
        while (curr != null && i < pos - 1) {
            curr = curr.next;
            i++;
        }

        if (curr == null) {
            System.out.println("Position is beyond the length of the list.");
            return head;
        }

        newNode.next = curr.next;
        newNode.prev = curr;

        if (curr.next != null) {
            curr.next.prev = newNode;
        }

        curr.next = newNode;

        return head;
    }
    public static Node deleteAtFirst(Node head){
        if(head==null){
            System.out.println("No element to delete");
            return null;
        }
        head.next.prev = null;
        head = head.next;
        return head;
    }

    public static Node deleteAtGivenPosition(Node head,int pos){
        if (head == null){
            System.out.println("No element to delete");
            return null;
        }
        if (pos <= 0) {
            System.out.println("Invalid position. Must be 1 or greater.");
            return head;
        }
        if (pos == 1){
            head.next.prev = null;
            head = head.next;
            return head;
        }
        Node curr = head;
        int i = 1;
        while(i<pos && curr.next!=null){
            curr = curr.next;
            i++;
        }
        if (i<=pos-1){
            System.out.println("position is Out of bounds . List contains only "+i+" elements");
            return head;
        }
        if (curr.next == null){
            curr.prev.next = null;
            return head;
        }
        curr.next.prev = curr.prev;
        curr.prev.next = curr.next;
        return head;

    }
    public static Node deleteAtLast(Node head){
        if (head == null){
            System.out.println("No element to delete");
            return null;
        }

        if (head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.prev.next = null;
        return head;
    }

    public static boolean search(Node head,int data){
        if (head == null){
            System.out.println("List is Empty");
            return false;
        }
        Node temp = head;
        while(temp != null){
            if (temp.data == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static Node reverse(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node currNode = head;
        Node prevNode = currNode.prev;
        while(currNode!=null){
            prevNode = currNode.prev;

            currNode.prev = currNode.next;
            currNode.next = prevNode;

            currNode = currNode.prev;
        }
        head = prevNode.prev;
        return head;
    }

    public static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void displayFromLast(Node head){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        head = insertAtFirst(null,1);
        head = insertAtLast(head,2);
        head = insertAtLast(head,3);
        head = insertAtLast(head,4);
        head = insertAtLast(head,5);
        display(head);

        System.out.println("INSERTION at pos 3");
        head = insertAtGivenPosition(head,10, 3);
        display(head);


        System.out.println("Displaying the LIST");
        display(head);

        System.out.println("Displaying the Reverse LIST");
        displayFromLast(head);

        head = deleteAtFirst(head);
        System.out.println("After deletion of FIRST NODE");
        display(head);

        head = deleteAtLast(head);
        System.out.println("After deletion of LAST NODE");
        display(head);

        head = deleteAtGivenPosition(head,3);
        System.out.println("Deletion at POSITION 3");
        display(head);

        System.out.println("Search for element value = 10");
        System.out.println(search(head,10));

        System.out.println("Reversing LINKED LIST");
        display(reverse(head));
    }
}
