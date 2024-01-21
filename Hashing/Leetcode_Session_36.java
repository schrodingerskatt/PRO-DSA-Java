// Problem Link : https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/description/
import java.util.*;
public class Leetcode_Session_36 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    int [] freq = new int [n+1];
    ArrayList<List<Integer>> ans = new ArrayList<>();
    for(int num : arr){
        if(freq[num]>= ans.size()){
            ans.add(new ArrayList<>());
        }
        ans.get(freq[num]).add(num);
        freq[num]++;
    }
    for (List<Integer> innerList : ans) {
        for (Integer value : innerList) {
            System.out.print(value + " ");
        }
        System.out.println();  // Move to the next line after each inner list
    }
}
    
}
