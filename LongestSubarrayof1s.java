//https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
//Given a binary array nums, you should delete one element from it.
//Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

class Solution {
    public int longestSubarray(int[] nums) {
        
        int LongestWindow=0;
        int left=0;
        int countOfZero=0;
        for(int i=0;i<nums.length;i++)
        {

            if(nums[i]==0)
            {
                countOfZero++;
            }
            while(countOfZero>1)
                {
                    
                    if(nums[left]==0)
                    {
                        countOfZero-=1;
                    }
                    left++;
                }
               
                LongestWindow=Math.max(LongestWindow,i-left);
            }

            
        
        return LongestWindow;
        
    }
}
