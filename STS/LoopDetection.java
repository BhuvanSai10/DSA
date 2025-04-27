package DSA.STS;

import java.util.HashMap;
import java.util.HashSet;

public class LoopDetection {
    public static Node head = null;
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

    public static boolean detectLoopUsingHashMap(Node head){
        if (head==null || head.next == null ){
            return false;
        }
        HashSet<Node> hs = new HashSet<>();
        Node temp = head;
        while (temp!=null){
            if (hs.contains(temp)){
                return true;
            }
            hs.add(temp);
            temp = temp.next;
        }

        return false;
    }
    public static void main(String[] args) {
        head= new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        //head.next.next.next = head;  creates loop
        System.out.println(detectLoopUsingHashMap(head));
    }
}
