import java.util.*;
public class Subarray_sum_k {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nums [] = new int[n];
        for(int i = 0; i < n; i++){
            nums[i]=scn.nextInt();
        }
        int k = scn.nextInt();

        HashMap<Integer,Integer>hmp = new HashMap<>();
        hmp.put(0,1);
        int count = 0;
        int total_sum = 0;
        for(int i = 0; i < n; i++){

            total_sum+=nums[i];

            if(hmp.containsKey(total_sum-k)){
                count+=hmp.get(total_sum-k);
            }
            hmp.put(total_sum,hmp.getOrDefault(total_sum,0)+1);
        }
    System.out.println(count);

    }
}
