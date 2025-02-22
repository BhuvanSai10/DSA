package DSA;

class StackNode{
    int data;
    StackNode next;
    StackNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class Stack {
    public Stack(){
        top = null;
    }
    static StackNode top;

    public static boolean isEmpty(){
        return top==null;
    }

    public static int peek(){
        if (isEmpty()){
            return -1;
        }
        return top.data;
    }
    public static void push(int data){
        StackNode newNode = new StackNode(data);
        if (isEmpty()){
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    public static int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int data = peek();
        top = top.next;
        return data;
    }

    public static void display(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        StackNode temp = top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        display();
    }
}
