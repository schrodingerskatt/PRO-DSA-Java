import java.util.Scanner;

public class Nth_root_of_m {

    public static double power(double num, int n){
        double ans = 1.0;
        for(int i = 1; i <= n; i++){
            ans = ans*num;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        double low = 1;
        double high = m;
        while(high-low > 1e-7){
            double mid = low+(high-low)/2;
            double value = power(mid,n);
            if(value < m){
                low = mid; // we are not doing mid + 1, because we don't want low to exceed high.
            }else{
                high = mid; // we are not doing mid - 1, because we don't want low to exceed high
                            // In case, low and high are very close.
            }
        }
        System.out.println(low);
    }
    
}
