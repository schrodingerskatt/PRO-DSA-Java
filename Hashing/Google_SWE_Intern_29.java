// Problem Link : Given an array of size N find the maximum sum subarray which has the same 
//                elements in the start and end.

import java.util.*;
public class Google_SWE_Intern_29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer>hmp = new HashMap<>();
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i <n; i++){

            max_sum = Math.max(max_sum,arr[i]);
            if(!hmp.containsKey(arr[i])){
                hmp.put(arr[i],sum);
            }else{
                int val = sum+arr[i]-hmp.get(arr[i]);
                max_sum = Math.max(max_sum,val);
                hmp.put(arr[i],Math.min(hmp.get(arr[i]),sum));
            }
            sum+=arr[i];
        }
    System.out.println(max_sum);
    }
    
}
