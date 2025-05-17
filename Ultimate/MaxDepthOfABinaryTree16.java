package DSA.Ultimate;

import DSA.Prep.Tress.TreeNode;

public class MaxDepthOfABinaryTree16 {
    public static int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return Math.max(lh,rh)+1;
    }
}
