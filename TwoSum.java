class Solution {
    public int[] twoSum(int[] nums, int target) {

       Map<Integer,Integer> numMap = new HashMap<>();
       int[] solution;
       for(int i=0;i<nums.length;i++)
       {
           numMap.put(nums[i],i);
       } 

       for(int i=0;i<nums.length;i++)
       {
           int temp = target - nums[i];
           if(numMap.containsKey(temp) && numMap.get(temp) != i)
           {
               return new int[] { i, numMap.get(temp) };
              
            }
       }  
       return null;
    }
}
