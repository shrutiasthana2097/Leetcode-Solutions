//https://leetcode.com/problems/valid-palindrome/

//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
//it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.

class Solution {
    public boolean isPalindrome(String s) {
       
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();
       
        
        if(s=="")
        {
            return true;
        }
        for(int i=0,j=s.length()-1;j>=i;i++,j--)
        {
            
            if(s.charAt(j)==s.charAt(i))
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
