import java.util.*;
public class Min_sum_x_element_y_diff {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long [] arr = new long[(int)n];
        for(long i = 0; i < n; i++){
            arr[(int)i] = scn.nextInt();
        }
        long x = scn.nextLong();
        long y = scn.nextLong();

        /** int min_sum = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){

            int j = i;
            int sum = 0;
            int c = 0;
            while(j >= 0 && c <x){
                sum+=arr[j];
                c++;
                x-=y;
            }

            if(c==x){
                min_sum = Math.min(min_sum,sum);
            }
        }
        System.out.println(min_sum); **/

        long [] prefix = new long[(int)n];
        for(long i = 0; i < n; i++){
            if(i-y>=0){
                prefix[(int)i] = arr[(int)i]+prefix[(int)(i-y)];
            }
            else{
                prefix[(int)i] = arr[(int)i];
            }
        }
        long min_sum = (long) 1e18;
        for(long i = 0; i < n; i++){
            long index = i - (x-1)*y;
            if(index > 0){
                long g = prefix[(int)i];
                if(index-y > 0){
                    g = g - prefix[(int)(index-y)];
                }
            min_sum = Math.min(min_sum,g);
            }
        }
        
    System.out.println(min_sum);

    }
}
