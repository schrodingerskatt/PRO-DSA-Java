import java.util.*;

public class Cisco_ideathon {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer,Integer>hmp = new TreeMap<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
                hmp.put(x,hmp.getOrDefault(x, 0)+y);
        }
        int rate = sc.nextInt();
        int max_packets = sc.nextInt();
            
    }
}

