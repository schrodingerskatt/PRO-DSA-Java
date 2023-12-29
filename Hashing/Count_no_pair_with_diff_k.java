public class Count_no_pair_with_diff_k {

/*
import java.util.HashMap;
public class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> hmp = new HashMap<>();
        int count_diff = 0;

        for (int num : nums) {
            count_diff += hmp.getOrDefault(num-k,0);
            count_diff += hmp.getOrDefault(num+k,0);
            hmp.put(num,hmp.getOrDefault(num,0)+1);
        }
        return count_diff;
    }
}
*/   
}
