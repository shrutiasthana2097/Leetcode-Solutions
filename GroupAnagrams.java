//https://leetcode.com/problems/group-anagrams/description/
//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List> strListMap = new HashMap<String,List>();
        int[] charRefArr = new int[26];
        for(String s:strs)
        {
                Arrays.fill(charRefArr,0);
                char[] sCharArr=s.toCharArray();
             

                for(int i=0;i<sCharArr.length;i++)
                {
                    charRefArr[sCharArr[i]-'a']++;
                }

                StringBuilder sb = new StringBuilder("");
                for(int i=0;i<26;i++)
                {
                    sb.append("#");
                    sb.append(charRefArr[i]);

                }
                if(!strListMap.containsKey(sb.toString()))
                {
                    strListMap.put(sb.toString(),new ArrayList());
                }
                strListMap.get(sb.toString()).add(s);

        }
        return new ArrayList(strListMap.values());
    }
        
}
