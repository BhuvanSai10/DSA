package DSA.Tress;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class PreOrderTraversalIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.prettyDisplay();
        System.out.println(preOrderTraversal(BinaryTree.root));
    }

    private static List<Integer> preOrderTraversal(BinaryTree.Node root) {
        List<Integer> list = new LinkedList<>();
        Stack<BinaryTree.Node> stack = new Stack<>();
        if (root == null){
            return list;
        }

        stack.push(root);
        while (!stack.isEmpty()){
            root = stack.pop();
            list.add(root.value);
            if (root.right!= null){
                stack.push(root.right);
            }
            if (root.left!=null){
                stack.push(root.left);
            }
        }
        return list;
    }
}
