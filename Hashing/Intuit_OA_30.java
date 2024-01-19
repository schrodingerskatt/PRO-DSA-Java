// Problem Link : https://www.desiqna.in/15111/intuit-oa-sde1-2023-may

import java.util.*;
public class Intuit_OA_30 {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    HashSet<Integer>hs= new HashSet<>();
    int count = 0;
    for(int i = 0; i < n; i++){
        int val = arr[i]-k;
        if(hs.contains(val)){
            count++;
            hs.remove(val);
        }
    hs.add(arr[i]);
    }
    System.out.println(count);
}
}
