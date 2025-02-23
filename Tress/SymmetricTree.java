package DSA.Tress;

public class SymmetricTree {
    public static boolean isSymmetric(BinaryTree.Node root){
        return isEqual(root.left,root.right);
    }
    public static boolean isEqual(BinaryTree.Node root1,BinaryTree.Node root2){
        if (root1 == null && root2 == null)
            return true;
        else if (root1 == null || root2 == null)
            return false;
        return (root1.value == root2.value)
                && isEqual(root1.left, root2.right)
                && isEqual(root1.right, root2.left);
    }
}
