import java.util.*;
public class Arcesium_OA_15 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String x = scn.next();
        String y = scn.next();

        HashMap<Character,Integer>even_x = new HashMap<>();
        HashMap<Character,Integer>odd_x = new HashMap<>();
        HashMap<Character,Integer>even_y = new HashMap<>();
        HashMap<Character,Integer>odd_y = new HashMap<>();

        for(int i = 0; i < x.length();i++){
            char ch = x.charAt(i);
            if (i%2==0){
                even_x.put(ch,even_x.getOrDefault(ch, 0)+1);
            }else{
                odd_x.put(ch,odd_x.getOrDefault(ch,0)+1);
            }
        }

        for(int i = 0; i < y.length(); i++){
            char ch = y.charAt(i);
            if(i%2==0){
                even_y.put(ch,even_y.getOrDefault(ch,0)+1);
            }else{
                odd_y.put(ch,odd_y.getOrDefault(ch,0)+1);
            }
        }
        boolean flag = even_x.equals(even_y) && odd_x.equals(odd_y);
        if (flag){
            System.out.println("Can be converted");
        }else{
            System.out.println("Cannot be converted");
        }

    }
}
