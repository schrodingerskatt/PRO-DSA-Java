import java.util.*;
public class BFS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>>G = new ArrayList<>();

        for(int i = 0; i <= n; i++){
            G.add(new ArrayList<Integer>());
        }

        for(int i = 1; i <= m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            G.get(u).add(v);
            G.get(v).add(u);
        }

        Queue<Integer>q = new LinkedList<>();
        q.add(1);
        int [] used = new int[n+5];
        used[1] = 1;
        int [] level = new int[n+5];
        level[1]=0;

        while(!q.isEmpty()){
            int v = q.remove();
            System.out.println("Node : "+v+" Level is : "+level[v]);
            for(int i = 0; i < G.get(v).size();i++){
                int u = G.get(v).get(i);
                if(used[u]==0){
                    q.add(u);
                    used[u]=1;
                    level[u] = level[v]+1;
                }
            }
        }
    }
    
}
