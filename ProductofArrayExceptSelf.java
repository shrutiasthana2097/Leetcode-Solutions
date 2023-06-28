//https://leetcode.com/problems/product-of-array-except-self/description/
//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];
        int[] answer = new int[nums.length];
        int arrLen = nums.length;

        leftProduct[0]=1;
        rightProduct[arrLen-1]=1;
        for(int i=1;i<nums.length;i++)
        {

            leftProduct[i] = leftProduct[i-1]*nums[i-1];
        }
        for(int i=arrLen-2;i>=0;i--)
        {

            rightProduct[i] = rightProduct[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++)
        {

            answer[i] = leftProduct[i]*rightProduct[i];
        }
        return answer;
    }
}
