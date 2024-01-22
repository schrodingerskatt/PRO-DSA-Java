// Problem Link : https://leetcode.com/problems/continuous-subarray-sum/description/
import java.util.*;
public class Leetcode_Session_42 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        HashMap<Integer,Integer>hmp = new HashMap<>();
        int sum = 0;
        boolean flag = false;
        for(int i = 0; i < n; i++){
            sum+=arr[i];
            int mod_val = sum%k;
            if(sum == 0 && i+1 >=2){
                flag = true;
                break;
            }
            if(hmp.containsKey(mod_val)){
                // this separate if condition handles [5, 0, 0, 0] and k = 3
// we can't add && (i-hmp.get(mod_val)>=2) inside if 
                if(i-hmp.get(mod_val)>=2){
                    flag = true;
                    break;
                }
            }else{
                hmp.put(mod_val, i);
            }
            }
        if(flag){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        }
    }
    

