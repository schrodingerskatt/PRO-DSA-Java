// Problem : 

import java.util.*;
public class Google_OA_39 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n+1];
        int total = 0;
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
            total+=arr[i];
        }

        int prev = 0;
        int sum = 0;
        int count = 0;
        int answer = 0;

        for(int i = 1; i <= n; i++){
            if(i==1){
                sum = sum+arr[i];
                prev = arr[i];
            }
            else{
                int diff = arr[i]-arr[i-1];
                if(diff == 1){
                    count++;
                    sum = prev+arr[i]*(count+1);
                    prev = sum;
                }else{
                    count = 0;
                    sum = arr[i];
                    prev = arr[i];
                }
            }
        answer = answer+sum;
        }
    

    prev = 0;
    sum = 0;
    count = 0;

    for(int i = 1; i <= n; i++){
        if(i==1){
            sum+=arr[i];
            prev = arr[i];
        }
        else{
            int diff = arr[i]-arr[i-1];
            if(diff == 0){
                count++;
                sum = prev+arr[i]*(count+1);
                prev = sum;
            }else{
                count = 0;
                sum = arr[i];
                prev = arr[i];
            }
        }
    answer = answer+sum;
    }
    
    System.out.println(answer-total);

    }
}
