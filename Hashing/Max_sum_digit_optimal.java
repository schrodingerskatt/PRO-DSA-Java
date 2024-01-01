import java.util.*;
public class Max_sum_digit_optimal {

    public static long total(long v) {
        long sum = 0;
        while (v != 0) {
            sum = sum + v % 10;
            v = v / 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        ArrayList<Long>arr = new ArrayList<>();
        for(long i = 0; i < n; i++){
            arr.add(sc.nextLong());
        }
        HashMap<Long, Long>hmp = new HashMap<>();
        long max_value = -1;
        for(int i = 0; i < n; i++){
            if(hmp.containsKey(total(arr.get(i)))){
                long pair_sum = arr.get(i)+hmp.get(total(arr.get(i)));
                max_value = Math.max(max_value,pair_sum);
                hmp.put(total(arr.get(i)),Math.max(arr.get(i),hmp.get(total(arr.get(i)))));
            }else{
                hmp.put(total(arr.get(i)),arr.get(i));
            }
        }
        System.out.println(max_value);
        }
        
    }
    

