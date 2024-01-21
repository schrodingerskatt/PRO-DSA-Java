// Problem Link : https://leetcode.com/problems/count-number-of-nice-subarrays/description/
import java.util.*;
public class Google_Interview_session33 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    for(int i = 0; i < n; i++){
        if(arr[i]%2==1){
            arr[i] = 1;
        }else{
            arr[i] = 0;
        }
    }
    HashMap<Integer, Integer>hmp = new HashMap<>();
    hmp.put(0,1);
    int sum = 0;
    int count = 0;
    for(int i = 0; i < n; i++){
        sum+=arr[i];
        if(hmp.containsKey(sum-k)){
            count+=hmp.get(sum-k);
        }
        hmp.put(sum,hmp.getOrDefault(sum,0)+1);
    }
System.out.println(count);
}
    
}
