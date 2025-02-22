package DSA.Tress;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class InorderTraversalIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.prettyDisplay();
        System.out.println(inOrderTraversal(BinaryTree.root));
    }

    private static List<Integer> inOrderTraversal(BinaryTree.Node root) {
        List<Integer> list = new LinkedList<>();
        if (root == null){
            return list;
        }
        Stack<BinaryTree.Node> stack = new Stack<>();
        BinaryTree.Node node = root;

        while (true){
           if (node!=null){
               stack.push(node);
               node = node.left;
           }
           else{
               if (stack.isEmpty()){
                   break;
               }
               node = stack.pop();
               list.add(node.value);
               node = node.right;
           }
        }
        return list;
    }

}
