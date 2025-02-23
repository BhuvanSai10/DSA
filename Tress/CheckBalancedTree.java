package DSA.Tress;

public class CheckBalancedTree {
    public static int check(BinaryTree.Node root){
        if (root == null){
            return 0;
        }
        int lh = check(root.left);
        if (lh==-1){
            return -1;
        }
        int rh = check(root.right);
        if (rh == -1){
            return -1;
        }
        if (Math.abs(lh-rh)>1){
            return -1;
        }

        return Math.max(lh,rh)+1;
    }
}
