package DSA.Ultimate;

import java.util.Stack;

 public class MinStack14 {
    private Stack<int[]> s;

    public MinStack14() {
        s = new Stack<>();
    }

    public void push(int x) {
        int newMin = s.isEmpty() ? x : Math.min(x, s.peek()[1]);
        s.push(new int[]{x, newMin});
    }

    public void pop() {
        if (!s.isEmpty()) {
            s.pop();
        }
    }

    public int peek() {
        return s.isEmpty() ? -1 : s.peek()[0];
    }

    public int getMin() {
        return s.isEmpty() ? -1 : s.peek()[1];
    }

    public static void main(String[] args) {
        MinStack14 ss = new MinStack14();

        ss.push(2);
        ss.push(3);
        System.out.print(ss.peek() + " ");
        ss.pop();
        System.out.print(ss.getMin() + " ");
        ss.push(1);
        System.out.print(ss.getMin() + " ");
    }
}

