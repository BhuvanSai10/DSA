package DSA.STS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    public static ArrayList<Integer> bfs(int n,ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visted = new boolean[n+1];
        ArrayList<Integer> bfs = new ArrayList<>();

        q.add(1);
        visted[1] = true;

        while (!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            for (Integer i:adj.get(node)){
                if (!visted[i]){
                    q.add(i);
                    visted[i] = true;
                }
            }
        }

        return bfs;
    }
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // for undirected graph
    }
    public static void main(String[] args) {
        int n = 6;
        ArrayList<ArrayList<Integer>> adj =  new ArrayList<>();
        for (int i = 0 ; i<=n ; i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 2, 5);
        addEdge(adj, 3, 6);

        System.out.println("printing graph");
        for (int i = 0 ; i<=n ; i++){
            System.out.println(adj.get(i));
        }

        ArrayList<Integer> result = bfs(n, adj);
        System.out.println("BFS Traversal starting from node 1:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
