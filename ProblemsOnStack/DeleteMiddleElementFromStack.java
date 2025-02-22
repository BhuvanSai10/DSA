package DSA.ProblemsOnStack;

import java.util.Stack;

public class DeleteMiddleElementFromStack {
    public static void deleteMid(Stack<Character> st)
    {
        int n = st.size();
        Stack<Character> tempSt = new Stack<>();
        int count = 0;

        while (count < n / 2) {
            char c = st.peek();
            st.pop();
            tempSt.push(c);
            count++;
        }

        st.pop();

        while (!tempSt.empty()) {
            st.push(tempSt.peek());
            tempSt.pop();
        }
    }
    public static void main(String[] args) {
        Stack<Character> st = new Stack();

        // push elements into the stack
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');
        st.push('5');
        st.push('6');


        deleteMid(st);

        while (!st.empty()) {
            char p = st.peek();
            st.pop();
            System.out.print(p + " ");
        }
    }
}
