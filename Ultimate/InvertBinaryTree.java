package DSA.Ultimate;

import DSA.Prep.Tress.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode rl = invertTree(root.left);
        TreeNode rr = invertTree(root.right);
        root.left = rr;
        root.right = rl;
        return root;
    }
}
