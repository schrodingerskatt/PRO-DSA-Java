// Asked in Google OA : Count the number of mountain subarrays(length.>=3) in the array 
/*
1<=N<=100000
1<=A[i]<=100000000
I/P : [1 2 4 2 1] 
O/P : [1 2 4 2] , [2 4 2], [2 4 2], [1 2 4 2 1] => 4
*/

import java.util.*;
public class No_of_mountain_subarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n+1];
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }
        int []prefix = new int[n+1];
        prefix[1] = 1;
        for(int i = 2; i <=n; i++){
            if(arr[i] > arr[i-1]){
                prefix[i] = prefix[i-1]+1;
            }else{
                prefix[i] = 1;
            }
        }
        int []suffix = new int[n+1];
        suffix[n] = 1;
        for(int i = n-1; i >=0; i--){
            if(arr[i]>arr[i+1]){
                suffix[i] = suffix[i+1]+1;
            }else{
                suffix[i] = 1;
            }
        }
    int max_possibility = 0;
    for(int i = 1; i <= n; i++){
       int possibilty=(prefix[i]-1)*(suffix[i]-1);
       max_possibility+=possibilty;
       
    }
    System.out.println(max_possibility);
    }
    
}
