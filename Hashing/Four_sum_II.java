// Problem Link : https://leetcode.com/problems/4sum-ii/description/
import java.util.*;
public class Four_sum_II {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] num1 = new int[n];
        int [] num2 = new int[n];
        int [] num3 = new int[n];
        int [] num4 = new int[n];
        for(int i = 0; i < n; i++){
            num1[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            num2[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            num3[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            num4[i] = sc.nextInt();
        }

        HashMap<Integer, Integer>hmp = new HashMap<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                hmp.put(num1[i]+num2[j],hmp.getOrDefault(num1[i]+num2[j],0)+1);
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
            int temp = num3[i]+num4[j];
            if(hmp.containsKey(-temp)){
                count+=hmp.get(-temp);
            }
            }
        }
    System.out.println(count);
    }
}
