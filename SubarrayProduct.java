//https://leetcode.com/problems/subarray-product-less-than-k/description/
//Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0;
        int product=1;
        int result=0;
        if (k <= 1) return 0;
        for(int i=0;i<nums.length;i++)
        {
            product*=nums[i];
            while(product>=k)
            {
                product/=nums[left];
                left++;
            }
            result = result + i - left + 1;
        }
        return result;
    }
}
