//https://leetcode.com/problems/contains-duplicate-ii/
//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> mapp = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(mapp.containsKey(nums[i]))
            {
                int index = mapp.get(nums[i]);
                if(Math.abs(index-i)<=k)
                {
                    return true;
                }
                else
                {
                    mapp.put(nums[i],i);
                }
            }
            else
            {
                mapp.put(nums[i],i);
            }
        }
        return false;
    }
}
