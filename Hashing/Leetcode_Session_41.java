import java.util.*;
public class Leetcode_Session_41 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    int sum = 0;
    int short_length = Integer.MAX_VALUE;
    HashMap<Integer, Integer>hmp = new HashMap<>();
    for(int i = 0; i < n; i++){
        sum+=arr[i];
        if(sum == target){
            short_length = Math.min(short_length, i+1);
        }
        if(hmp.containsKey(sum-target)){
            short_length = Math.min(short_length, i-hmp.get(sum-target)+1);
        }
        hmp.put(sum,i);
    }
    System.out.println(short_length);
}

}
