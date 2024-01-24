import java.util.*;
public class Uber_OA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int [] prefix_a = new int[n+5];
        int [] prefix_b = new int[n+5];
        int [] suffix_a = new int[n+5];
        int [] suffix_b = new int[n+5];

        char start = s.charAt(0);
        if(start == 'b'){
            prefix_a[0] = 1;
        }
        if(start == 'a'){
            prefix_b[0] = 1;
        }
        for(int i = 1; i < n; i++){
            char ch = s.charAt(i);
            if(ch =='a'){
                prefix_a[i]=prefix_a[i-1];
            }else{
                prefix_a[i] = prefix_a[i-1]+1;
            }
        }

        for(int i = 1; i < n; i++){
            char ch = s.charAt(i);
            if(ch == 'b'){
                prefix_b[i] = prefix_b[i-1];
            }else{
                prefix_b[i] = prefix_b[i-1]+1;
            }
        }

        char end = s.charAt(n-1);
        if(end=='b'){
            suffix_a[n-1]=1;
        }
        if(end == 'a'){
            suffix_b[n-1]=1;
        }
        for(int i = n-2; i >=0; i--){
            char ch = s.charAt(i);
            if(ch == 'a'){
                suffix_a[i] = suffix_a[i+1];
            }else{
                suffix_a[i] = suffix_a[i+1]+1;
            }
        }

        for(int i = n-2; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch == 'b'){
                suffix_b[i] = suffix_b[i+1];
            }else{
                suffix_b[i] = suffix_b[i+1]+1;
            }
        }
        int min_flips = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
        int ab = prefix_a[i]+suffix_b[i+1];
        int ba = prefix_b[i]+suffix_a[i+1];
        min_flips = Math.min(Math.min(ab,ba),min_flips);
        }

        System.out.println(min_flips);


    }
}
