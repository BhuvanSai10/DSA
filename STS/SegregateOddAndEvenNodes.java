package DSA.STS;

public class SegregateOddAndEvenNodes {
    static Node head = null;
    public static void insert(int data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public static void display(){
        Node temp = head;
        while (temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node segregate(Node head){
        Node eStart = new Node(0);
        Node oStart = new Node(0);

        Node eEnd = eStart;
        Node oEnd = oStart;
        Node curr = head;

        while (curr != null) {
            int val = curr.data;

            if (val % 2 == 0) {
                eEnd.next = curr;
                eEnd = eEnd.next;
            } else {
                oEnd.next = curr;
                oEnd = oEnd.next;
            }
            curr = curr.next;
        }
        oEnd.next = null;
        eEnd.next = oStart.next;

        return eStart.next;
    }

    public static void main(String[] args) {
        insert(1);
        insert(4);
        insert(5);
        insert(7);
        insert(10);
        insert(3);
        insert(12);
        display();
        head = segregate(head);
        display();
    }
}
