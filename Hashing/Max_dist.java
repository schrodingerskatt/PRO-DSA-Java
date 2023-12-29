// Problem Link : https://www.geeksforgeeks.org/maximum-distance-two-occurrences-element-array/

import java.util.*;
public class Max_dist {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>hmp = new HashMap<>();
        int max_diff = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(hmp.containsKey(arr[i])){
                int index = hmp.get(arr[i]);
                max_diff = Math.max(max_diff,i-index);
            }else{
                hmp.put(arr[i],i);
            }
        }
    System.out.println(max_diff);
    }
}
