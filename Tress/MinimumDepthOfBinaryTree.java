package DSA.Tress;

public class MinimumDepthOfBinaryTree {
    public int minDepth(BinaryTree.Node root) {
        if (root == null)
            return 0;

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (left == 0)
            return right + 1;
        if (right == 0)
            return left + 1;
        return Math.min(left, right) + 1;
    }
}
