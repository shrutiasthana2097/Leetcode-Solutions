//https://leetcode.com/problems/majority-element/
//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. 

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mapp = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(mapp.containsKey(nums[i]))
            {
                int count=mapp.get(nums[i]);
                mapp.put(nums[i],count+1);
            }
            else
            {
                mapp.put(nums[i],1);
            }
        }

        Map.Entry<Integer,Integer> Majority = null; 

        for(Map.Entry<Integer,Integer> current : mapp.entrySet())
        {
            if(Majority==null || current.getValue() > Majority.getValue())
            {
                Majority=current;
            }
        }
        return Majority.getKey();
    }
}
