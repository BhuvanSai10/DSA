package DSA.Tress;

public class DiameterOfBinaryTree {
    public static int[] maxDiameter = new int[1];
    public static int findDiameter(BinaryTree.Node root,int[] maxDiameter){
        if (root == null){
            return 0;
        }
        int lh = findDiameter(root.left,maxDiameter);
        int rh = findDiameter(root.right,maxDiameter);

        maxDiameter[0] = Math.max(maxDiameter[0],(lh+rh));

        return Math.max(lh,rh)+1;

    }
}
