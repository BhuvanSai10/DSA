//Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
// A leaf is a node with no children.
package DSA.Tress;

public class PathSum {
    private boolean check(BinaryTree.Node root, int targetSum, int[] sum) {
        if (root == null)
            return false;

        sum[0] += root.value;

        if (root.left == null && root.right == null)
            if (sum[0] == targetSum)
                return true;

        if (check(root.left, targetSum, sum) || check(root.right, targetSum, sum))
            return true;

        sum[0] -= root.value;

        return false;
    }

    public boolean hasPathSum(BinaryTree.Node root, int targetSum) {
        int[] sum = new int[1];
        return check(root, targetSum, sum);
    }
}
