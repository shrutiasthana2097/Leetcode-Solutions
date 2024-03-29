//https://leetcode.com/problems/valid-anagram/
//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.


class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }

        int[] charOccurence = new int[26];

        for(int i=0;i<s.length();i++)
        {
            charOccurence[s.charAt(i)-'a']++;
            charOccurence[t.charAt(i)-'a']--;
        }

        for(int i=0;i<charOccurence.length;i++)
        {
            if(charOccurence[i]!=0)
            return false;

        }

        return true;
    }
}
