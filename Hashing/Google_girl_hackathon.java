// Problem Link : https://www.desiqna.in/13650/google-girl-hackathon-coding-questions-solutions-2023-kumar

import java.util.*;
public class Google_girl_hackathon {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long [] arr = new long[(int)(n+1)];
        long k = scn.nextLong();
        
        for(int i = 1; i <= n; i++){
            arr[(int)i] = scn.nextLong();
        }

        long [] prefix = new long[200005];
        for(int i = 1; i <= n; i++){
            long l = arr[(int)i]-k;
            long r = arr[(int)i]+k;
            prefix[(int)l] = prefix[(int)l]+1;
            prefix[(int)(r+1)] = prefix[(int)(r+1)]-1;
        }
        long max_length_subseq = 1;
        for(int i = 1; i <= 200000; i++){
            prefix[(int)i] = prefix[(int)(i-1)]+prefix[(int)i];
            max_length_subseq = Math.max(max_length_subseq, prefix[(int)i]);
        }
        System.out.println(max_length_subseq);
    }
}
