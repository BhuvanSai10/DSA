package DSA.STS;
import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    private static void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int i, Stack<Integer> s) {
        visited[i] = true;
        for (Integer node : adj.get(i) ){
            if (!visited[node]){
                dfs(adj,visited,node,s);
            }
        }
        s.push(i);
    }
    public static ArrayList<Integer> topoSort(ArrayList<ArrayList<Integer>> adj,int n){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        boolean[] visited = new boolean[n];

        for (int i = 0 ; i<n ; i++){
            if (!visited[i]){
                dfs(adj,visited,i,s);
            }
        }

        while (!s.isEmpty()){
            res.add(s.pop());
        }

        return res;
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
    }
    public static void main(String[] args) {
        int n = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0 ; i<=n ; i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj,5,2);
        addEdge(adj,5,0);
        addEdge(adj,4,0);
        addEdge(adj,4,1);
        addEdge(adj,2, 3);
        addEdge(adj,3,1);

        System.out.println(topoSort(adj,n));


    }
}
