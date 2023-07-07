//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
//Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice.

class Solution {
    public int removeDuplicates(int[] nums) {
        
         int j=1,count=1;
         for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[i-1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(count<=2)
            {
                nums[j]=nums[i];
                j++;
            }
            
        }
        return j;
    }
    
}
