// Problem Link : https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/description/

import java.util.*;
public class Max_value_ordered_triplet_I {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        long [] prefix = new long[n];
        prefix[1] = nums[0] - nums[1];
        long max_value = 0;

        for(int k = 2; k < n; k++){
            long pre = prefix[k-1];
            int i = k-1;
            while(i >= 0){
                pre = Math.max(pre,(long)(nums[i]-nums[k]));
                i--;
            }
            prefix[k] = pre;
            max_value = Math.max(max_value,prefix[k-1]*(long)nums[k]);
        }
    System.out.println(max_value);
    }
    
}
