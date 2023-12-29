// Problem Link : https://leetcode.com/problems/find-common-characters/
// Solution Link : https://leetcode.com/problems/find-common-characters/submissions/1131347312/

public class Find_common_character {

/*
class Solution {
    public List<String> commonChars(String[] words) {

        String first = words[0];
        HashMap<Character,Integer>freq = new HashMap<>();
        for(int i = 0; i < first.length(); i++){
            char ch = first.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        for(int i = 1; i < words.length; i++){
            String second = words[i];
            HashMap<Character, Integer>freq_second = new HashMap<>();
            for(int j = 0; j < second.length(); j++){
                char ch = second.charAt(j);
                freq_second.put(ch,freq_second.getOrDefault(ch,0)+1);
            }
        for(Character key:freq.keySet()){
            if(freq_second.containsKey(key)){
                freq.put(key,Math.min(freq.get(key),freq_second.get(key)));
            }else{
                freq.put(key,0);
            }
        }
        }
        ArrayList<String>ans = new ArrayList<>();
        for(Character key:freq.keySet()){
            if(freq.get(key)>0){
                for(int i = 0; i < freq.get(key);i++){
                    ans.add(key+"");
                }
            }
        }
    return ans;
    }
}
 */
    
}
