// Problem Statement :  Given an array of integers(positive as well as negative) ,select some elements 
//                      from this array(select a subset) such that :
//                      1. Sum of those elements is maximum(Sum of the subset is maximum)
//                      2. No two elements in the subset should be consecutive


import java.util.*;
public class Max_non_adjacent_sum {

public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int [] arr = new int[n];
for(int i = 0; i < n; i++){
    arr[i] = sc.nextInt();
}
int exclude = 0;
int include = arr[0];
for(int i = 1; i < n; i++){
    include = Math.max(include, exclude);
    exclude+=arr[i];
    int temp = exclude;
    exclude = include;
    include = temp;
    
}
System.out.println(Math.max(include,exclude));
}    
}
