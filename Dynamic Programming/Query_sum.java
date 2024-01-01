// Problem Statement : We are given an array of integers(a[n]). We are given multiple queries of the 
//                      form : (1, i) which means we need to output the sum of all numbers from 
//                      index- ‘1’ to index ‘i’ of the array.

import java.util.*;
public class Query_sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int q = scn.nextInt();
        int q_arr[] = new int[q];
        for(int i = 0; i < q; i++){
            q_arr[i] = scn.nextInt();
        }
        int[] a = {6, 7, 3, 2, 2};
        int dp[] = new int[q+1];
        dp[0]= a[0];
        for(int i = 1; i < q; i++){
            dp[i]=dp[i-1]+a[i];
        }
        for(int i = 0; i < q; i++){
            System.out.println(dp[q_arr[i]]);
        }
    }
    
}
