class CLLNode{
    int data;
    CLLNode next;
    CLLNode(int data){
        this.data = data;
        this.next = null;
    }
}


public class CircularLL {
    public static CLLNode head;
    public static CLLNode tail;
    public CircularLL(){
        head = null;
        tail = null;
    }
    public static void insertAtBeginning(int data){
        CLLNode newNode = new CLLNode(data);
        if (head==null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
    }
    public static void insertAtEnd(int data){
        CLLNode newNode = new CLLNode(data);
        if (head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }
    public static void deleteAtBeginning(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        if (head == tail){
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        tail.next = head;
    }

    public static void deleteAtEnd(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        if (head == tail){
            head = null;
            tail = null;
            return;
        }
        CLLNode temp = head;
        while (temp.next!=tail){
            temp = temp.next;
        }
        temp.next = head;
        tail = temp;
    }

    public static void display(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        CLLNode temp = head;
        while(temp.next != head){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println(temp.data+"->"+temp.next.data);
    }


    public static void main(String[] args) {
        insertAtEnd(3);
        insertAtEnd(2);
        insertAtEnd(1);
        insertAtEnd(0);
        display();
    }
}
