package DSA.Tress;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderTraversal {
    public static List<List<Integer>> levelOrderTraversal(BinaryTree.Node root){

        Queue<BinaryTree.Node> queue = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();
        if (root ==  null){
            return list;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> subList = new LinkedList<>();
            for (int i = 0 ; i<levelSize  ; i++){
                if (queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                subList.add(queue.poll().value);
            }
            list.add(subList);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.prettyDisplay();
        System.out.println(levelOrderTraversal(BinaryTree.root));
    }
}
