package ProblemsOnStack;

import java.util.Stack;
//Algorithm for Postfix to Prefix:
//
//        Read the Postfix expression from left to right
//        If the symbol is an operand, then push it onto the Stack
//        If the symbol is an operator, then pop two operands from the Stack
//        Create a string by concatenating the two operands and the operator before them.
//        string = operator + operand2 + operand1
//        And push the resultant string back to Stack
//        Repeat the above steps until end of Postfix expression.
public class PostfixToPrefixConversion {
    public static String convertPostfixToPrefix(String s){
        Stack<String> stack = new Stack<>();
        for (char c:s.toCharArray()){
            if (!(c=='+'|| c=='-'|| c=='/' || c=='*')){
                stack.push(c+"");
            }
            else{
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                String x = c + operand2 + operand1;
                stack.push(x);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        System.out.println(convertPostfixToPrefix("ABC/-AK/L-*"));
    }
}
