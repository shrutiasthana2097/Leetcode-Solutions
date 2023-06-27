//https://leetcode.com/problems/contains-duplicate/
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> numSet = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            numSet.add(nums[i]);
        }

        if(numSet.size()<nums.length)
        {
            return true;
        }
        else
        return false;
    }
}
