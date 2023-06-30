//https://leetcode.com/problems/roman-to-integer/
//Given a roman numeral, convert it to an integer.

class Solution {
    public int romanToInt(String s) {

        Map<Character,Integer> mapp = new HashMap<Character,Integer>();
        mapp.put('M',1000);
        mapp.put('D',500);
        mapp.put('C',100);
        mapp.put('L',50);
        mapp.put('X',10);
        mapp.put('V',5);
        mapp.put('I',1);
        int sum=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(mapp.get(s.charAt(i)) >= mapp.get(s.charAt(i+1)))
            {
                sum+=mapp.get(s.charAt(i));
            }
            else
            {
                sum-=mapp.get(s.charAt(i));
            }
        }
        sum+=mapp.get(s.charAt(s.length()-1));
        return sum;
        
    }
}
