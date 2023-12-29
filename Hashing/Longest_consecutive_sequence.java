// Problem Link : https://leetcode.com/problems/longest-consecutive-sequence/
// Solution Link : https://leetcode.com/problems/longest-consecutive-sequence/submissions/1131359716/

public class Longest_consecutive_sequence {
/*
 class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer>sequence = new HashSet<>();
        for(int num:nums){
            sequence.add(num);
        }

        int longest_consecutive = 0;
        for(int num:nums){
            int start_point = num-1;
            if(!sequence.contains(start_point)){
                int next_num = num+1;
                while(sequence.contains(next_num)){
                    next_num++;
                }
                longest_consecutive = Math.max(longest_consecutive,next_num-num);
            }
        }
        return longest_consecutive;
}
}
 */
    
}
