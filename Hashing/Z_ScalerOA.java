// Problem : We are given an array of size “N”; find the number of subarrays which
//            have the same element at start as well as end ; and the sum of that 
//            subarray(excluding the first and last number) = first number = last number.
// Link : https://www.desiqna.in/15839/zscaler-oa-2023-sep-set-10

import java.util.*;

class Pair<K, V> {
    private final K first;
    private final V second;
 
    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }
 
    public K getFirst() {
        return first;
    }
 
    public V getSecond() {
        return second;
    }
}

public class Z_ScalerOA {

// Brute Force Approach :

/*
int arr [] = new int [n+1];
for(int i = 1; i <= n; i++){
    int sum = 0;
    for(int j = i; j <= n; j++){
        sum+=a[j];
        int focus_sum = sum -(a[j]+a[i]);
        if(a[i]==a[j]&&focus_sum==a[i]) count++;
    }
} 
return count
*/


public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
TreeMap<Pair<Integer,Integer>,Integer>Mp = new TreeMap<>((a,b) ->{

    if(!a.getFirst().equals(b.getFirst())){
        return a.getFirst().compareTo(b.getFirst());
    }
    return a.getSecond().compareTo(b.getSecond());
});

int count = 0;
int sum = 0;
int i = 1;

while(i <= n){
int number = sc.nextInt();
sum+=number;
int focus_sum = sum-number;
int g = focus_sum-number;
Pair<Integer, Integer> pair = new Pair<>(number, g);
count+=Mp.getOrDefault(pair, 0);
Mp.put(new Pair<>(number,sum),Mp.getOrDefault(new Pair<>(number, sum),0)+1);
i++;
}
System.out.println(count);
}
}
