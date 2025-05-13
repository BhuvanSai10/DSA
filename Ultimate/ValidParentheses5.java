package DSA.Ultimate;

import java.util.Stack;

public class ValidParentheses5 {
    public static boolean containsValidParentheses(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0 ; i<s.length(); i++){
            char curr = s.charAt(i);
            if (curr!='}' && curr!=']' && curr!=')'){
                stack.push(curr);
            }else{
                if (!stack.isEmpty() && ((stack.peek()=='{' && curr=='}')||
                        (stack.peek()=='[' && curr==']')||
                        (stack.peek()=='(' && curr==')')) ){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(containsValidParentheses("{}[]()"));
    }
}
