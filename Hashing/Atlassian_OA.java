// Problem Link : Given an array of size “N”; find a subset from an array with a particular property 
//                and the sum of that subset should be maximum possible. 
// i-j = S[i]-S[j] =>S[j]-j = S[i]-i


import java.util.*;
public class Atlassian_OA {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    Map<Integer,Integer>hmp = new HashMap<>();
    for(int i = 0; i < n; i++){
        int diff = arr[i]-i;
        if(hmp.containsKey(diff)){
            hmp.put(diff,hmp.get(diff)+arr[i]);
        }else{
        hmp.put(diff,arr[i]);
    }
}
    int max_subarray = 0;
    for(Map.Entry<Integer,Integer>entry:hmp.entrySet()){
        max_subarray = Math.max(max_subarray,entry.getValue());
    }
    System.out.println(max_subarray);
    
}
}
