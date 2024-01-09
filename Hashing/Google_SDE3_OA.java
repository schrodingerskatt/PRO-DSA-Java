// Problem Link : https://docs.google.com/document/d/1LthiOPD4CvHTu9d0_h_XKJF9U9BYdjYYetnjjAPQLpo/edit

import java.util.*;
public class Google_SDE3_OA {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int [] pref = new int[n];
        int [] suff = new int [n];
        pref[0] = 0;

        int j = 1;
        while(j < n){
            int count = 0;
            int i = 0;
            while(i < j){
                if(arr[i] > arr[j]){
                    count++;
                }
            i++;
            }
        pref[j] = count;
        j++;
        }

        j = n-2;
        suff[n-1] = 0;
        while(j >= 0){
            int count = 0;
            int k = j+1;
            while(k <= n-1){
                if(arr[j] < arr[k]){
                    count++;
                }
            k++;
            }
        suff[j] = count;
        j--;
        }

        int total_pairs = 0;

        for(int i = 1; i < n; i++){
            total_pairs+=suff[i]*pref[i];
        }
    
    System.out.println(total_pairs);
    }

}
