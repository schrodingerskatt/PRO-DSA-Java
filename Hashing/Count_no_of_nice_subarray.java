// Problem Link : https://leetcode.com/problems/count-number-of-nice-subarrays/description/

public class Count_no_of_nice_subarray {

/*
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2==1){
                nums[i] = 1;
            }else{
                nums[i] = 0;
            }
        }
        HashMap<Integer,Integer>hmp = new HashMap<>();
        hmp.put(0,1);
        int sum = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            sum+=nums[i];
            if(hmp.containsKey(sum-k)){
                count+=hmp.get(sum-k);
            }
            hmp.put(sum,hmp.getOrDefault(sum,0)+1);

        }
    return count;
    }
} 
*/
    
}
