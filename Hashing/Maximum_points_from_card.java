// Problem Link : https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/
// Asked in Media.Net and Google : https://www.desiqna.in/16087/media-net-oa-sde1-ctc-28-l

public class Maximum_points_from_card {

/*
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int[] suff = new int[n+1];
        suff[n] = 0;
        suff[n-1] = cardPoints[n-1];
        for(int i = n-2; i >= 0; i--){
            suff[i] = cardPoints[i]+suff[i+1];
        }
        int preff = 0;
        int ans = suff[n-k];
        for(int i = 0; i < k; i++){
            preff = preff+cardPoints[i];
            int suff_red = suff[n-k+(i+1)];
            ans = Math.max(ans,preff+suff_red);
        }
        return ans;
    }
}
*/
    
}
