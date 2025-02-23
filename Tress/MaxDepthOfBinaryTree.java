package DSA.Tress;

import java.util.Scanner;

public class MaxDepthOfBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.prettyDisplay();
        System.out.println(findMaxDepth(BinaryTree.root));
    }

    private static int findMaxDepth(BinaryTree.Node root) {
        if (root == null){
            return 0;
        }
        int lh = findMaxDepth(root.left);
        int rh = findMaxDepth(root.right);

        return 1+Math.max(lh,rh);
    }
}
