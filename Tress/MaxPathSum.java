package DSA.Tress;

public class MaxPathSum {
    public static int[] maxi = new int[1];
    public static int findMaxPathSum(BinaryTree.Node root,int[] maxi){
        if (root == null){
            return 0;
        }
        int lh = findMaxPathSum(root.left,maxi);
        int rh = findMaxPathSum(root.right,maxi);

        maxi[0] = Math.max(maxi[0],(root.value + lh + rh) );
        return Math.max(lh,rh) + root.value;
    }
}
