// Problem Link : https://leetcode.com/problems/first-unique-character-in-a-string/description/
// Solution : https://leetcode.com/problems/first-unique-character-in-a-string/solutions/

public class First_unique_char {

    /*
        class Solution {
        public int firstUniqChar(String s) {

            HashMap<Character,Integer>hmp = new HashMap<>();
            for(int i = 0; i < s.length();i++){
                char ch = s.charAt(i);
                if(hmp.containsKey(ch)){
                    hmp.put(ch,hmp.get(ch)+1);
                }else{
                    hmp.put(ch,1);
                }
            }
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                if(hmp.get(ch)==1){
                    return i;
                }
            }
        return -1;
        }
    }
     */
    
}
