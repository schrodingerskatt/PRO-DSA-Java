// Problem Statement : https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

public class Longest_subarray_sum_k {

    /*
    class Solution{
    public static int lenOfLongSubarr (int A[], int N, int K) {
    
    HashMap<Integer,Integer>hmp = new HashMap<>();
    int sum = 0;
    int max_len = 0;
    hmp.put(0,1);
    for(int i = 0; i < N; i++){
        sum+=A[i];
        if(hmp.containsKey(sum-K)){
            max_len = Math.max(max_len,i-hmp.get(sum-K));
        }
        if(!hmp.containsKey(sum)){
           hmp.put(sum,i+1);
        }
    }
    return max_len;
    }
    
    
} 
    */
    
}
