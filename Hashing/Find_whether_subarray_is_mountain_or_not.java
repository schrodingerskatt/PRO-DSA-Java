// Problem Link : https://www.geeksforgeeks.org/find-whether-subarray-form-mountain-not/

import java.util.Scanner;

public class Find_whether_subarray_is_mountain_or_not {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int L = sc.nextInt();
        int R = sc.nextInt();
        int [] left = new int[n];
        int [] right = new int [n];

        left[0] = arr[0];
        right[n-1] = arr[n-1];
        
        int last_increasing_index = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[i-1]){
                last_increasing_index = i;
            }
            left[i] = last_increasing_index;      
        }

        last_increasing_index = n-1;
        for(int i = n-2; i >= 0; i--){
            if(arr[i]>arr[i+1]){
                last_increasing_index = i;
            }
            right[i] = last_increasing_index;
        }

        if(left[R] <= right[L]){
            System.out.println("Mountain peek found");
        }else{
            System.out.println("No Mountain Peek");
        }

    
    }
    
}
