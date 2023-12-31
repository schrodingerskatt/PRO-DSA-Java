import java.util.*;
public class DFS {

    public static void DFS(int node, ArrayList<ArrayList<Integer>>G, int[] visited, int[] parent){
        System.out.print(node+" ");
        visited[node] = 1;
        for(int nbh: G.get(node)){
            if(visited[nbh]==0){
                parent[nbh]=node;
                DFS(nbh,G,visited,parent);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>>G = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            G.add(new ArrayList<>());
        }

        for(int i = 1; i <= m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            G.get(u).add(v);
            G.get(v).add(u);
        }
        int [] visited = new int[n+5];
        int [] parent = new int[n+5];
        for(int i = 0; i < n+5; i++){
            visited[i] = 0;
            parent[i] = 0;
        }
        DFS(1, G, visited, parent);

    }
    
}
