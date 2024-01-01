// Problem Link : https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words/

import java.util.*;
public class Longest_pallindrome_by_conactenation{

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    ArrayList<String>words = new ArrayList<>();
    int n = sc.nextInt();
    sc.nextLine();
    for(int i = 0; i < n; i++){
        words.add(sc.nextLine());
    }
    HashMap<String, Integer> mp = new HashMap<>();
    for(int i = 0; i < words.size(); i++){
        mp.put(words.get(i), mp.getOrDefault(words.get(i),0)+1);
    }
    int size = 0;
    boolean flag = true;
    for(int i = 0; i < words.size(); i++){
        String rev = new StringBuilder(words.get(i)).reverse().toString();
        if(!words.get(i).equals(rev)){
        if(mp.getOrDefault(rev, 0) > 0 && mp.getOrDefault(words.get(i),0) > 0){
          size+=4;
          mp.put(words.get(i),mp.get(words.get(i))-1);
          mp.put(rev,mp.get(rev)-1);
        }
    }
    else{
        if(mp.getOrDefault(words.get(i),0)> 1){
            size+=4;
            mp.put(words.get(i),mp.get(words.get(i))-2);
        }
        else if(mp.getOrDefault(words.get(i),0)== 1 && flag == true){
            size+=2;
            flag = false;
            mp.put(words.get(i),mp.get(words.get(i))-1);
        }
    }
    
}
System.out.println(size);   
}
}
