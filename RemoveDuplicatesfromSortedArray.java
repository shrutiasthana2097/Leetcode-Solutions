//https://leetcode.com/problems/remove-duplicates-from-sorted-array
//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
//Then return the number of unique elements in nums.

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i=1;
        
        for(int j=1;j<nums.length;j++)
        {
            if(nums[j]==nums[j-1])
            {
                continue;
            }
            else
            {
                nums[i]=nums[j];
                i+=1;
            }
        }
        return i;
    }
}
