package DSA.Tress;

public class CheckIfTwoTressAreSame {
    public boolean isSameTree(BinaryTree.Node p,BinaryTree.Node q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return (p.value == q.value) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
