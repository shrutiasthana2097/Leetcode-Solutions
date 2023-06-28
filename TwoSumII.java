//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
//Two Sum II - Input Array Is Sorted


class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        /*Map<Integer,Integer> mapp = new HashMap<Integer,Integer>();
        int[] arr = new int[2];
        for(int i=0;i<numbers.length;i++)
        {
            mapp.put(numbers[i],i);
        }
        for(int i=0;i<numbers.length;i++)
        {
            if(mapp.containsKey(target-numbers[i]))
            {
                arr[0]=i+1;
                arr[1]=mapp.get(target-numbers[i])+1;
                break;
            }
            
        }
        return arr;*/

        int l=0;
        int r=numbers.length-1;
        int[] arr = new int[2];
        while(l<r)
        {
            int sum = numbers[l]+numbers[r];
            if(sum==target)
            {
                arr[0]=l+1;
                arr[1]=r+1;
                return arr;
            }
            else if(sum<target)
            {
                l++; 
            }
            else
            {
                 r--;
            }
        }
        return arr;
    }
}
