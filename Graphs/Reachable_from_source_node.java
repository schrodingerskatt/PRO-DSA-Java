// In this problem, we need to find whether all nodes can be visited from the source node.

import java.util.*;
public class Reachable_from_source_node {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>>G = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            G.add(new ArrayList<Integer>());
        }
        for(int i = 1; i <= e; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            G.get(u).add(v);
            G.get(v).add(u);
        }
        Queue<Integer>q = new LinkedList<>();
        int source = sc.nextInt();
        q.add(source);
        int [] visited = new int[n+5];
        visited[source]=1;
        while(!q.isEmpty()){
            int v = q.remove();
            for(int i = 0; i < G.get(v).size(); i++){
                int u = G.get(v).get(i);
                if(visited[u]==0){
                    q.add(u);
                    visited[u]=1;
                }
            }
        }
        for(int i = 1; i <= n; i++){
            if(visited[i]==0){
                System.out.println("Node "+i+" cannot be visited from source");
            }else{
                System.out.println("Node can be visited from source");
            }
        }
    
    }
}

