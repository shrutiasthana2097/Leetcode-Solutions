//https://leetcode.com/problems/merge-sorted-array/
//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1=m-1;
        int ptr2=n-1;
        int ptr=m+n-1;

    while(ptr>=0)
    {
        if(ptr2<0)
        {
            break;
        }
        if(ptr1>=0 && nums1[ptr1] > nums2[ptr2])
        {
            nums1[ptr]=nums1[ptr1];
            ptr1--;
            ptr--;
        }
        else
        {
            nums1[ptr]=nums2[ptr2];
            ptr2--;
            ptr--;   
        }
    }
}
}
