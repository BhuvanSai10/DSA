package ProblemsOnStack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    public static Queue<Integer> q1 = new LinkedList<Integer>();
    public static Queue<Integer> q2 = new LinkedList<Integer>();

    public static int curr_size;
    public static void push(int x)
    {
        // Push x first in empty q2
        q2.add(x);
        // Push all the remaining
        // elements in q1 to q2.
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }
        // swap the names of two queues
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }
    public static void pop()
    {
        // if no elements are there in q1
        if (q1.isEmpty())
            return;
        q1.remove();
    }

    static int top()
    {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }

    static int size() { return q1.size(); }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        pop();
        System.out.println("Top element : "+ top());
        pop();
        System.out.println(top());
    }
}
