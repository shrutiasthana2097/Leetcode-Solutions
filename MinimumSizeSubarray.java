//https://leetcode.com/problems/minimum-size-subarray-sum/
//Given an array of positive integers nums and a positive integer target, return the minimal length of a 
//subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int count=Integer.MAX_VALUE;
        
        int left=0;
        
        
        int sum=0;

        for(int right=0;right<nums.length;right++)
        {
            sum=sum+nums[right];
            while(sum>=target)
            {
                count=Math.min(count,right-left+1);
                sum=sum-nums[left++];
            }
         
            
        }
        return count==Integer.MAX_VALUE?0:count;
    }
}
