// Problem Link : https://leetcode.com/problems/max-number-of-k-sum-pairs/description/

import java.util.*;
public class Max_no_sum_k_pair {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    HashMap<Integer, Integer>hmp = new HashMap<>();
    int count = 0;
    for(int i = 0; i < n; i++){
        int search = k - arr[i];
        if(hmp.getOrDefault(search,0)>0){
            hmp.put(search,hmp.get(search)-1);
            count++;
        }
        else{
            hmp.put(arr[i],hmp.getOrDefault(hmp, 0)+1);
        }
    }
System.out.println(count);
}
    
}
