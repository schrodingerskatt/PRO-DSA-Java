import java.util.*;
public class Atlassian_SDE_31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        HashMap<Integer,Integer>hmp = new HashMap<>();
        for(int i = 0; i < n; i++){

            if(!hmp.containsKey(arr[i])){
                hmp.put(arr[i],sum);
            }
            if(hmp.containsKey(arr[i]+k)){
                int total = sum+arr[i]-hmp.get(arr[i]+k);
                max_sum = Math.max(max_sum,total);
                hmp.put(arr[i],Math.min(hmp.get(arr[i]),sum));
            }
            if(hmp.containsKey(arr[i]-k)){
                int total = sum+arr[i]-hmp.get(arr[i]-k);
                max_sum = Math.max(max_sum,total);
                hmp.put(arr[i],Math.min(hmp.get(arr[i]),sum));
            }
        sum+=arr[i];
        }
        if(max_sum == Integer.MAX_VALUE){
            max_sum = 0;
        }
        System.out.println(max_sum);
    }
    
}
