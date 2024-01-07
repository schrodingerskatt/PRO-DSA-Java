// Problem Link : https://www.desiqna.in/16189/backend-engineer-hackerrank-online-test

import java.util.*;
public class Hackerrank_OA_backend {

    public static int convert(String s){
        int h1 = s.charAt(0)-'0';
        int h2 = s.charAt(1)-'0';
        int hh = (h1*10+h2)*60;

        int m1 = s.charAt(3)-'0';
        int m2 = s.charAt(4)-'0';
        int mm = m1*10+m2;

        return hh+mm;
    }

    public static void convert_to_hhmm(int minutes){

        int hh = minutes/60;
        int mm = minutes%60;
        String hhs, mms;

        if(hh < 9 && mm < 9){
            hhs = "0"+ Integer.toString(hh); 
            mms = "0"+ Integer.toString(mm); 
        }else if (hh < 9 && mm > 9){
             hhs = "0"+ Integer.toString(hh); 
             mms = Integer.toString(mm);
        }else if(hh > 9 && mm < 9){
            hhs = Integer.toString(hh);
            mms = "0"+Integer.toString(mm);
        }else{
            hhs = Integer.toString(hh);
            mms = Integer.toString(mm);
        }

        System.out.println(hhs+":"+mms);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] max_minutes = new int[1441];
        for(int i = 0; i < n; i++){
            String name = sc.next();
            String activity = sc.next();
            String start = sc.next();
            String end = sc.next();

            int start_minutes = convert(start);
            int end_minutes = convert(end);
            
            max_minutes[start_minutes]++;
            max_minutes[end_minutes+1]--;
        }

        for(int i = 1; i <= 1440; i++){
            max_minutes[i] = max_minutes[i]+max_minutes[i-1];
        }
        int free = 0;
        boolean flag = false;
        for(int i = 0; i <= 1440; i++){
            if(max_minutes[i]==0){
                free++;
                if(free == k){
                    convert_to_hhmm(i-k+1);
                    flag = true;
                    break;
                }
            }else{
                free = 0;
            }
        }
        if(flag == false){
            System.out.println("-1");
        }
    }
    
}
