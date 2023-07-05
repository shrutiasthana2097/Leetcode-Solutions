//https://leetcode.com/problems/longest-substring-without-repeating-characters/
//Given a string s, find the length of the longest  substring without repeating characters.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=0;
        int count=0;
        Map<Character,Integer> seenCharacters = new HashMap<Character,Integer>();
        List<Character> keysToRemove = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(seenCharacters.containsKey(s.charAt(i)))
            {

                int index = seenCharacters.get(s.charAt(i));
                count=i-index;
               
                int keytoremove=index;
                keysToRemove.clear();
                for (Character  key : seenCharacters.keySet()) {
                   if(seenCharacters.get(key)<index)
                   {
                    keysToRemove.add(key);
                    keytoremove--;
                    
                    if (keytoremove == 0) {
                     break;
                    }
                   }
                 }
                 for(Character c:keysToRemove)
                 {
                     
                     seenCharacters.remove(c);
                     
                 }
                
            }
            else
            {
                count+=1;
            }
            length=Math.max(length,count);
           
            seenCharacters.put(s.charAt(i),i);
            
        }
        return length;
    }
}
