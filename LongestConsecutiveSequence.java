//https://leetcode.com/problems/longest-consecutive-sequence/
//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

class Solution {
    public int longestConsecutive(int[] nums) {
        

        int currentStreak=0, LongestStreak=0;
        Set<Integer> numSet = new TreeSet<Integer>();
        for(int i:nums)
        {
            numSet.add(i);

        }

        for(int numb:numSet)
        {
            System.out.println(numb);
            if(!numSet.contains(numb-1))
            {
                //currentNum=numb;
                currentStreak=1;
            }
            else
            {
                currentStreak++;
            }

            LongestStreak=Math.max(LongestStreak,currentStreak);
        }
        return LongestStreak;
    }
}
