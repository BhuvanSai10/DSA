package DSA.Queue;

class QueueNode{
    int data;
    QueueNode next;
    QueueNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class Queue {
    static QueueNode front;
    static QueueNode rear;
    public Queue(){
        front = null;
        rear = null;
    }
    public static boolean isEmpty(){
        return front == null && rear == null;
    }
    public static void enqueue(int data){
        QueueNode newNode= new QueueNode(data);
        if (isEmpty()){
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    public static int dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        if (front ==  rear){
            int data = front.data;
            front = null;
            rear = null;
            return data;
        }
        int data  = front.data;
        front = front.next;
        return data;
    }

    public static int peek(){
        if (isEmpty()){
            return -1;
        }
        return front.data;
    }

    public static void display(){
        QueueNode temp = front;
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        while(temp!=rear){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        display();
    }
}
