// Problem Link : https://www.desiqna.in/12820/vmware-sde1-coding-questions-and-solutions-india-april-2023

import java.util.Scanner;

public class Vmware_OA {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int n = str.length();
    int [] zero = new int[n];
    int [] one = new int[n];

    char ch = str.charAt(0);
    if(ch == '0'){
        zero[0] = 1;
    }else{
        zero[0] = 0;
    }

    if(ch == '1'){
        one[0] = 1;
    }else{
        one[0] = 0;
    }

    for(int i = 1; i < n; i++){
        ch = str.charAt(i);
        if(ch == '0'){
            zero[i] = 1+zero[i-1];
        }else{
            zero[i] = 0;
        }
    }

    for(int i = 1; i < n; i++){
        ch = str.charAt(i);
        if(ch == '0'){
            one[i] = 0;
        }else{
            one[i]= 1+one[i-1];
        }
    }

    int count = 0;

    for(int i = 0; i < n; i++){
        if(str.charAt(i)=='0'){
            int indx = i - zero[i];
            if(indx >= 0){
                if(one[indx]>=zero[i]){
                    count++;
                }
            }
        }else{
            int indx = i-one[i];
            if(indx >= 0){
                if(zero[indx]>=one[i]){
                    count++;
                }
            }
        }
    }
    System.out.println(count);
    }
}
