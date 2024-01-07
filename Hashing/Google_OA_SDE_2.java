// Problem Link : https://www.desiqna.in/13820/google-oa-sde2-jan-2023
import java.util.*;
public class Google_OA_SDE_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n+1];
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int i = 1; i <= n; i++){
            int currentIndex = i;
            int nextIndex = arr[currentIndex];
            int nextNextIndex = arr[nextIndex];
            mp.put(arr[nextNextIndex], mp.getOrDefault(arr[nextNextIndex], 0) + 1);
        }
        int no_of_pairs = 0;
        for(Integer key:mp.keySet()){
            int val = mp.get(key);
            no_of_pairs+=(val)*(val-1)/2;
        }
        System.out.println(no_of_pairs);


    }
    
}
