
//https://leetcode.com/problems/is-subsequence/
//Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

class Solution {
    public boolean isSubsequence(String s, String t) {
         int i = 0; int j = 0;
        while(i < s.length() && j < t.length()){
           if(s.charAt(i) == t.charAt(j)){
               i++;
               j++;
           } else{
               j++;
           }
        }
        return i == s.length();
    }
}
