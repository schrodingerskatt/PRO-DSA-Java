// Problem Link : https://www.spoj.com/problems/CSUMQ/
// Solution : https://www.spoj.com/status/CSUMQ,schrodingerkat/

import java.util.*;
public class Csumq{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int freq[] = new int[N];
        freq[0] = arr[0];
        for (int i = 1; i < N; i++) {
            freq[i] = arr[i] + freq[i - 1];
        }

        int Q;
        Q = sc.nextInt();
        for (int q = 0; q < Q; q++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            if (i == 0) {
                System.out.println(freq[j]);
            } else {
                System.out.println(freq[j] - freq[i - 1]);
            }
        }
    }
}