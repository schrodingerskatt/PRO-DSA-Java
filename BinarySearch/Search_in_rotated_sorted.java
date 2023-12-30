// Problem Link : https://leetcode.com/problems/search-in-rotated-sorted-array/description/

import java.util.*;
public class Search_in_rotated_sorted {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int low = 0;
        int high = n-1;
        boolean flag = true;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                System.out.println("Number is present at index : "+mid);
                flag = false;
                break;
            }else if(arr[mid] <= arr[high]){
                if(target > arr[mid] && target <= arr[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
            else if(arr[mid]>=arr[low]){
                if(target < arr[mid] && target >= arr[low]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            }
        if (flag == true){
        System.out.println("Target not found");
        }
    }
    }

