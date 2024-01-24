import java.util.*;
public class Leetcode_Session_43 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        HashMap<Integer,Integer>hmp = new HashMap<>();
        int sum = 0;
        int max_len = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++){
            sum+=arr[i];
            if(sum == target){
                max_len = Math.max(max_len,i+1);
            }if(hmp.containsKey(sum-target)){
                max_len = Math.max(max_len,i-hmp.get(sum-target));      
            }
            if(!hmp.containsKey(sum)){
                hmp.put(sum,i);
            }
            }
        System.out.println(max_len);
        }
    }

