import java.util.*;
public class Number_of_shortest_path_from_source {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<ArrayList<Integer>>G = new ArrayList<>();

        for(int i = 0; i <= n; i++){
            G.add(new ArrayList<Integer>());
        }

        for(int i = 0; i <= n; i++){
            int u = scn.nextInt();
            int v = scn.nextInt();
            G.get(u).add(v);
            G.get(v).add(u);
        }

        Queue<Integer>q = new LinkedList<>();
        q.add(1);
        int [] visited = new int[n+5];
        visited[1]=1;
        int [] level = new int[n+5];
        level[1]=0;
        int [] ways = new int[n+5];
        ways[1]=1;

        while(!q.isEmpty()){
            int v = q.remove();
            System.out.println(v + " " + ways[v]);
            System.out.println();
            for(int i = 0; i < G.get(v).size(); i++){
                int u = G.get(v).get(i);
                if(visited[u]==0){
                    q.add(u);
                    visited[u]=1;
                    level[u]=level[v]+1;
                    ways[u]+=ways[v];
                }else{
                    if(level[v]+1==level[u]){
                        ways[u] = ways[u]+ways[v];
                    }
                }
            }
        }



        




    }


    
}
