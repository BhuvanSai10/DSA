package ProblemsOnStack;

import java.util.Stack;

public class SortAStackUsingTemporaryStack {
    public static Stack<Integer> sort(Stack<Integer> stack){
        Stack<Integer> tempStack = new Stack<>();

        while(!stack.isEmpty()){
            int temp = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek()>temp)){

            }
        }
        return stack;
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

    }
}
