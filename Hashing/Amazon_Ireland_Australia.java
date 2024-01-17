// Problem Link : Given array “A” of size “N”; find the number of pairs in the array (i,j) such that 
//                  A[i] + A[j] is divisible by k 



import java.util.*;
public class Amazon_Ireland_Australia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        long n = sc.nextLong();
        long k = sc.nextLong();
        Map<Long, Long> mp = new HashMap<>();
        long sum = 0;
 
        for (long i = 1; i <= n; i++) {
            long yy = sc.nextLong();
            long g = k - (yy % k);
            sum += mp.getOrDefault(g, 0L);
            mp.put(yy % k, mp.getOrDefault(yy % k, 0L) + 1);
        }
 
        System.out.println(sum);
 
        sc.close();
    }
    
}
