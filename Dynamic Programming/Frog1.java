// Problem Link : https://atcoder.jp/contests/dp/tasks/dp_a

import java.util.*;
public class Frog1{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int []arr = new int[n+1];
    for(int i = 1; i <= n; i++){
      arr[i] = scn.nextInt();
    }
    int []dp = new int[n+1];
    dp[1] = 0;
    dp[2] = Math.abs(arr[2]-arr[1]);
    for(int i = 3; i <= n; i++){
      dp[i] = Math.min(Math.abs(arr[i]-arr[i-1])+dp[i-1],Math.abs(arr[i]-arr[i-2])+dp[i-2]);
    }
    System.out.println(dp[n]);
    
  }
}