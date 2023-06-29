//https://leetcode.com/problems/valid-parentheses/
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

class Solution {
    public boolean isValid(String s) {

        Map<Character,Character> mapp = new HashMap<Character,Character>();

        mapp.put('}','{');
        mapp.put(']','[');
        mapp.put(')','(');

        Stack<Character> stk = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char curr = s.charAt(i);
            if(mapp.containsKey(curr))
            {
                char TopElement;
                if(!stk.isEmpty())
                {
                    TopElement=stk.pop();
                    if(TopElement!=mapp.get(curr))
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
               
            }
            else
            {
                stk.push(curr);
            }

        }
        return stk.isEmpty();
    }
}
