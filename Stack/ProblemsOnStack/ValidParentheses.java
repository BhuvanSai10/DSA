package DSA.Stack.ProblemsOnStack;

import java.util.Stack;

public class ValidParentheses {
    public static boolean checkValidParentheses(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            }
            else {
                if (!st.empty() &&
                        ((st.peek() == '(' && s.charAt(i) == ')') ||
                                (st.peek() == '{' && s.charAt(i) == '}') ||
                                (st.peek() == '[' && s.charAt(i) == ']'))) {
                    st.pop();
                }
                else {
                    return false;
                }
            }
        }

        return st.empty();
    }
    public static void main(String[] args) {
        System.out.println(checkValidParentheses("[{()}]"));
    }
}
