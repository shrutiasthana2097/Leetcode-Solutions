//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int n=height.length;
        int maxarea=0;
        int currentarea=0;
        while(left < right)
        {
            currentarea=Math.min(height[left],height[right])*(right-left);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
            maxarea=Math.max(maxarea,currentarea);
        }
        return maxarea;

    }
}
