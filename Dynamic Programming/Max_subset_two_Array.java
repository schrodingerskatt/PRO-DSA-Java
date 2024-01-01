import java.util.*;
public class Max_subset_two_Array {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a1 = new int[n+1];
        for(int i = 1; i <= n; i++){
            a1[i]=sc.nextInt();
        }
        int [] a2 = new int[n+1];
        for(int i = 1; i <= n; i++){
            a2[i]=sc.nextInt();
        }
        int []dp = new int[n+1];
        dp[1] = Math.max(a1[1],a2[1]);
        dp[2] = Math.max(dp[1],Math.max(a1[2],a2[2]));

        for(int i = 3; i <= n; i++){
            dp[i]= Math.max(dp[i-2]+Math.max(a1[i], a2[i]),dp[i-1]);
        }
        System.out.println("Max Subset Sum");
        System.out.println(dp[n]);
    }
}
