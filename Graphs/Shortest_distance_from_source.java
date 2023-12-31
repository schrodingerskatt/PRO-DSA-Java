import java.util.*;
public class Shortest_distance_from_source {

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        ArrayList<ArrayList<Integer>>G = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            G.add(new ArrayList<Integer>());
        }
        for(int i = 1; i <=e; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            G.get(u).add(v);
            G.get(v).add(u);
        }
        int s = sc.nextInt();
        Queue<Integer>q = new LinkedList<>();
        q.add(s);
        int [] used = new int[n+5];
        used[s] = 1;
        int [] level = new int[n+5];
        level[s] = 0;

        while(!q.isEmpty()){
            int v = q.remove();
            for(int i = 0; i < G.get(v).size(); i++){
                int u = G.get(v).get(i);
                if(used[u]==0){
                    q.add(u);
                    used[u] = 1;
                    level[u] = level[v]+1;
                }
            }
        }

        for(int i = 1; i <= n; i++){
            System.out.print(level[i]+" ");
        }
    }
    
}
