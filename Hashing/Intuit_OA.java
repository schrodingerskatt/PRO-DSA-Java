// Problem Link : https://www.desiqna.in/5757/intuit-oa-coding-questions-set-2-2022-july

import java.util.*;
public class Intuit_OA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n+1];
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        int []prefix0 = new int[n+1];
        int []prefix1 = new int[n+1];

        for(int i = 1; i <= n; i++){
            if(arr[i]==0){
                prefix0[i] = prefix0[i-1]+1;
                prefix1[i] = prefix1[i-1];
            }else{
                prefix1[i] = prefix1[i-1]+1;
                prefix0[i] = prefix0[i-1];
            }
        }

        HashMap<Integer, Integer>hmp = new HashMap<>();
        int ans = 0;

        for(int i = 1; i <= n; i++){
            int lhs = prefix0[i-1]*y-prefix1[i-1]*x;
            hmp.put(lhs, hmp.getOrDefault(lhs, 0)+1);
            int rhs = prefix0[i]*y-prefix1[i]*x;
            ans+=hmp.getOrDefault(rhs, 0);
        }

        System.out.println(ans);
        
    }
}
