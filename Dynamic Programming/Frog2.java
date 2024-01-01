// Problem Link : https://atcoder.jp/contests/dp/tasks/dp_b

import java.util.*;
public class Frog2{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();
    int []arr = new int[n+1];
    for(int i = 1; i <= n; i++){
      arr[i] = scn.nextInt();
    }
    int []dp = new int[n+1];
    dp[1] = 0;
    for(int i = 2; i <= n; i++){
        int ans = Integer.MAX_VALUE;
      for (int j = 1; j <= k && i - j >= 1; j++) {
        ans = Math.min(Math.abs(arr[i]-arr[i-j])+dp[i-j],ans);
        dp[i] = ans;
      }
    }
    System.out.println(dp[n]);
  }
}