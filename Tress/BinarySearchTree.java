package DSA.Tress;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class BinarySearchTree {
    static TreeNode root;
    BinarySearchTree(){
        root = null;
    }
    public static void insert(int val) {
        root = insertRecursively(root,val);
    }
    public static TreeNode insertRecursively(TreeNode root ,int val){
        if(root == null){
            return new TreeNode(val);
        }
        if(val<root.val) {
            root.left =  insertRecursively(root.left , val);
        }
        else if (val > root.val){
            root.right = insertRecursively(root.right,val);
        }
        return root;
    }
    public static void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }
        if(val < root.val){
            return searchBST(root.left,val);
        }
        else {
            return searchBST(root.right,val);
        }
    }

    public static void main(String[] args) {
        insert(50);
        insert(40);
        insert(60);
        insert(30);
        insert(10);
        insert(55);
        insert(70);
        insert(5);
        insert(15);
        inOrder(root);
        System.out.println();
        inOrder(searchBST(root,10));
    }
}
