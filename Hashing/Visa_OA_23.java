// Problem Link : https://www.desiqna.in/16114/visa-oa-sde-intern-ctc-30-lac-27th-oct

import java.util.*;
public class Visa_OA_23 {

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int Q = scn.nextInt();
        int p = scn.nextInt();

        int [] lamp =  new int[100001];

        for(int i = 1; i <= Q; i++){
            int L = scn.nextInt();
            int R = scn.nextInt();
            lamp[L] = lamp[L]+1;
            if(R+1<=n){
                lamp[R+1] = lamp[R+1]-1;
            }
        }
        for(int i = 1; i <= n; i++){
            lamp[i] = lamp[i]+lamp[i-1];
        }
        for(int i = 1; i <=p; i++){
            int points = scn.nextInt();
            System.out.println(lamp[points]);
        }
    }    
}
