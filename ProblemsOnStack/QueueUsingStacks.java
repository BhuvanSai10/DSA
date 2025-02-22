package DSA.ProblemsOnStack;

import java.util.Stack;
public class QueueUsingStacks {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStacks(){
        first = new Stack<>();
        second = new Stack<>();
    }
    public void enqueue(int item){
        first.push(item);
    }
    public int dequeue(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
    public int peek(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked = second.peek();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }
    public void display(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        while (!second.isEmpty()){
            System.out.print(second.peek()+" ");
            first.push(second.pop());
        }
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();
        System.out.println();
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        queue.enqueue(4);
        queue.enqueue(5);
        queue.display();
    }
}
