//https://leetcode.com/problems/length-of-last-word/
//Given a string s consisting of words and spaces, return the length of the last word in the string.

class Solution {
    public int lengthOfLastWord(String s) {
        
        s=s.trim();
        int beginIndex=s.length()-1;
        while(beginIndex>=0 && s.charAt(beginIndex)!=' ')
        {
            beginIndex--;
            
        }

        int ans=s.length()-beginIndex-1;
        return ans;
}
}
