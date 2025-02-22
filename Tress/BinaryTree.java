package DSA.Tress;

import java.util.Scanner;

public class BinaryTree {
    private static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;

        }
    }
    public static Node root;

    public void populate(Scanner sc){
        System.out.println("Enter the root Node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc,root);
    }
    private void populate(Scanner sc,Node node){
        System.out.println("Do you want to enter left of "+node.value);
        boolean left = sc.nextBoolean();
        if (left){
            System.out.println("Enter the value to enter left of "+node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc,node.left);
        }
        System.out.println("Do you want to enter right of "+node.value);
        boolean right = sc.nextBoolean();
        if (right){
            System.out.println("Enter the value to enter right of "+node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc,node.right);
        }
    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }
    public void prettyDisplay(Node node, int level){
        if (node == null){
            return;
        }

        prettyDisplay(node.right,level+1);
        if (level!=0){
            for (int i =0 ; i<level-1 ; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------>"+node.value);
        }else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level+1);
    }

    public static void inorderTraversal(Node node){
        if (node == null){
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.value+" ");
        inorderTraversal(node.right);
    }

    public static void preorderTraversal(Node node){
        if (node ==  null){
            return;
        }
        System.out.print(node.value+" ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public static void postorderTraversal(Node node){
        if (node== null){
            return;
        }
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.value+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.prettyDisplay();
        inorderTraversal(root);
        System.out.println();
        preorderTraversal(root);
        System.out.println();
        postorderTraversal(root);
    }
}
