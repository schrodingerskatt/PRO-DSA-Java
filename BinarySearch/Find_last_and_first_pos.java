// Problem Link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class Find_last_and_first_pos
{
/*
class Solution {
    public int find_position(int[] nums, int target, boolean flag){
        int low = 0, high = nums.length-1;
        int pos = -1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(nums[mid] > target){
                high = mid - 1;
            }else if(nums[mid] < target){
                low = mid+1;
            }else{
                pos = mid;
                if(flag){
                    high = mid - 1;
                }
                else{
                    low = mid+1;
                }
            }
        }
    return pos;
    }

    public int[] searchRange(int[] nums, int target) {
        int first = find_position(nums,target,true);
        int last = find_position(nums,target,false);
        return new int[]{first,last};
    }
}
*/
}
