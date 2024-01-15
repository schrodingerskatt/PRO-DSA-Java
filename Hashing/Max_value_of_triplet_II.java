// Problem Link : https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-ii/description/

import java.util.*;
public class Max_value_of_triplet_II {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        long [] prefix = new long[n];
        prefix[1] = arr[0]-arr[1];
        long max_diff = Math.max(arr[0],arr[1]);
        long max_ans = 0;
        for(int k = 2; k < n; k++){
            long diff = max_diff - (long)arr[k];
            prefix[k] = Math.max(prefix[k-1],diff);
            max_ans = Math.max(max_ans,prefix[k-1]*(long)arr[k]);
            max_diff = Math.max(max_diff,arr[k]);
        }
    System.out.println(max_ans);
    }
    
}
