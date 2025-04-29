package DSA.STS;
// Java code for Vertical Traversal of a Binary Tree
// using HashMap, DFS, and ArrayList

import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int x) {
        data = x;
        left = null;
        right = null;
    }
}

public class VerticalOrderTraversal {

    // Helper function to perform DFS and
    // store nodes at different horizontal distances
    static void DFS(TreeNode root, int hd, int[] mn,
                    HashMap<Integer, ArrayList<Integer>> mp) {
        if (root == null)
            return;

        // Store the current node in the map at horizontal distance hd
        if (!mp.containsKey(hd))
            mp.put(hd, new ArrayList<>());

        mp.get(hd).add(root.data);

        // Update the minimum horizontal distance
        mn[0] = Math.min(mn[0], hd);

        // Recursively traverse the left and right subtrees
        DFS(root.left, hd - 1, mn, mp);
        DFS(root.right, hd + 1, mn, mp);
    }

    // Function to perform vertical order traversal of a binary tree
    static ArrayList<ArrayList<Integer>> verticalOrder(TreeNode root) {

        // HashMap to store nodes at each horizontal distance
        HashMap<Integer, ArrayList<Integer>> mp = new HashMap<>();

        // Array to track the minimum horizontal distance (mutable)
        int[] mn = {0};

        // Perform DFS to fill the hashmap with vertical levels
        DFS(root, 0, mn, mp);

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int hd = mn[0];

        // Traverse the map from minimum to maximum horizontal distance
        while (mp.containsKey(hd)) {
            res.add(mp.get(hd));
            hd++;
        }

        return res;
    }

    public static void main(String[] args) {
        // Constructing the binary tree:
        //        1
        //       / \
        //      2   3
        //     / \ / \
        //    4  5 6  7
        //          \  \
        //           8  9
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.left.right = new TreeNode(8);
        root.right.right.right = new TreeNode(9);

        ArrayList<ArrayList<Integer>> res = verticalOrder(root);

        for (ArrayList<Integer> temp : res) {
            System.out.print("[ ");
            for (int val : temp)
                System.out.print(val + " ");
            System.out.print("] ");
        }
    }
}