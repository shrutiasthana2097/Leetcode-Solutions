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
