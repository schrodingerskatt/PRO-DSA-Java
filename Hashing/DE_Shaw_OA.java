import java.util.*;

public class DE_Shaw_OA {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n+1];
        int total = 0;
        for(int i = 1; i < n+1; i++){
            arr[i] = sc.nextInt();
            total+=arr[i];
        }
        int [] d = new int[n+2];
        int [] c = new int[n+2];

        int sum = 0;
        for(int i = n; i >=1; i--){
            sum = sum+arr[i];
            d[i] = Math.min(sum,d[i+1]);
        }
        c[0] = arr[0];
        for(int i = 1; i <= n; i++){
            c[i] = Math.min(arr[i],arr[i]+c[i-1]);
        }
        int min_sum = Integer.MAX_VALUE;
        for(int i = 1; i <= n; i++){
            min_sum = Math.min(c[i]+d[i+1],min_sum);
        }

        System.out.println(total-2*min_sum);
    }
}
