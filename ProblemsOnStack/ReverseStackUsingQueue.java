package ProblemsOnStack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseStackUsingQueue {
    public static Stack<Character> reverseStack(Stack<Character> s){
        Queue<Character> queue = new LinkedList<>();
        while (!s.isEmpty()){
            char element = s.pop();
            System.out.print(element+" ");
            queue.add(element);
        }
        while (!queue.isEmpty()){
            s.push(queue.remove());
        }
        return s;
    }
    public static void main(String[] args) {
        Stack<Character> stack =  new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.print("Original Stack : ");
        Stack<Character> reversedStack = reverseStack(stack);
        System.out.println();
        System.out.print("Reversed Stack : ");
        while (!reversedStack.isEmpty()){
            System.out.print(reversedStack.pop()+" ");
        }
    }
}
