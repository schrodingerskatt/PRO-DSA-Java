import java.util.*;
public class Amazon_OA_24 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String t = scn.nextLine();

        HashMap<Character, Integer>hmp_s = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            hmp_s.put(ch, hmp_s.getOrDefault(ch,0)+1);
        }

        HashMap<Character, Integer>hmp_t = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            hmp_t.put(ch, hmp_t.getOrDefault(ch, 0)+1);
        }
        int max_times = Integer.MAX_VALUE;
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            max_times = Math.min(max_times, hmp_s.get(ch)/hmp_t.get(t));
        }
        System.out.println(max_times);

    }
}
