// Problem Link : https://docs.google.com/document/d/1LthiOPD4CvHTu9d0_h_XKJF9U9BYdjYYetnjjAPQLpo/edit

import java.util.*;
public class Google_SDE3_OA_followup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int [] pref = new int[n];
        int [] suff = new int[n];
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

        suff[n-1] = 0;
        int k = n-2;
        while(k >= 0){
            int count = 0;
            int l = k+1;
            while(l < n){
                if(arr[k] > arr[l]){
                    count++;
                }
                l++;
            }
            suff[k] = count;
            k--;
        }

        int total_pairs = 0;
        j = 0;
        while(j < n){
            k = j + 1;
            while(k < n){
                if(arr[j] < arr[k]){
                    total_pairs = total_pairs + pref[j]*suff[k];
                }
            k++;
            }
        j++;
        }
    System.out.println(total_pairs);
    }
}
