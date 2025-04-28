package DSA.STS;

import java.util.Stack;

public class TowerOfHanoi {
    static void moveDisk(Stack<Integer> src, Stack<Integer> dest, char s, char d) {
        int p1 = src.isEmpty() ? Integer.MAX_VALUE : src.peek();
        int p2 = dest.isEmpty() ? Integer.MAX_VALUE : dest.peek();

        if (p1 < p2) {
            dest.push(src.pop());
            System.out.println("Move disk " + p1 + " from " + s + " to " + d);
        } else {
            src.push(dest.pop());
            System.out.println("Move disk " + p2 + " from " + d + " to " + s);
        }
    }

    static void iterativeHanoi(int n, char source, char auxiliary, char destination) {
        Stack<Integer> src = new Stack<>();
        Stack<Integer> aux = new Stack<>();
        Stack<Integer> dest = new Stack<>();

        if (n % 2 == 0) {
            char temp = destination;
            destination = auxiliary;
            auxiliary = temp;
        }

        int totalMoves = (int) (Math.pow(2, n) - 1);

        for (int i = n; i >= 1; i--)
            src.push(i);

        for (int i = 1; i <= totalMoves; i++) {
            if (i % 3 == 1)
                moveDisk(src, dest, source, destination);
            else if (i % 3 == 2)
                moveDisk(src, aux, source, auxiliary);
            else if (i % 3 == 0)
                moveDisk(aux, dest, auxiliary, destination);
        }
    }

    public static void main(String[] args) {
        int numberOfDisks = 3;
        iterativeHanoi(numberOfDisks, 'S', 'A', 'D');
    }
}
