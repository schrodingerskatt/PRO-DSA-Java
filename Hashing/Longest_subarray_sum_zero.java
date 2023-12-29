// Problem Link : https://www.geeksforgeeks.org/find-the-largest-subarray-with-0-sum/

import java.util.*;
public class Longest_subarray_sum_zero {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        HashMap<Integer, Integer>hmp = new HashMap<>();
        int sum = 0;
        int max_len = 0;
        for(int i = 0; i < n; i++){

            sum+=arr[i];
            if(sum==0){
                max_len = i+1;
            }
            Integer prev_sum = hmp.get(sum);
            if(prev_sum!=null){
                max_len = Math.max(max_len,i-prev_sum);
            }else{
                hmp.put(sum,i);
            }

        }
    System.out.println(max_len);

    }
    
}
