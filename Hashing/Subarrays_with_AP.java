// Problem Link : https://www.geeksforgeeks.org/count-of-subarrays-forming-an-arithmetic-progression-ap/

import java.util.*;
public class Subarrays_with_AP {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    if(n < 2){
        System.out.println("Not possible");
        return;
    }
    int i = 1;
    int count_of_AP = 1;
    int subarray_count = 0;
    int t = 0;
    int diff = arr[1] - arr[0];
    while (i < n-1){
        if(arr[i+1]-arr[i]==diff){
            count_of_AP++;
        }else{
            if(count_of_AP >=1){
                t = count_of_AP+1;
                subarray_count = subarray_count + (t*(t+1))/2-t;
            }
            count_of_AP = 1;
            diff = arr[i+1]-arr[i];
        }
        i++;
    }
    if(count_of_AP >= 1){
        t = count_of_AP+1;
        subarray_count = subarray_count + (t*(t+1))/2-t;
    }
    System.out.println(subarray_count);
}
}
