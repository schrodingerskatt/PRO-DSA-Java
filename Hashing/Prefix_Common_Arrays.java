// Problem Link : https://leetcode.com/contest/biweekly-contest-103/problems/find-the-prefix-common-array-of-two-arrays/

public class Prefix_Common_Arrays {
    /*

    class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        Map<Integer, ArrayList<Integer>> hmp1 = new HashMap<>();
        Map<Integer, ArrayList<Integer>> hmp2 = new HashMap<>();
        
        int n = A.length;
        if(n==1){
        if(A[0]!=B[0]){
        return new int[]{0};
        }else{
            return new int[]{1};
        }
        }
        
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(A[0]);
        list1.add(A[1]);
        hmp1.put(1, list1);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(B[0]);
        list2.add(B[1]);
        hmp2.put(1, list2);
        
        
        for(int i = 2; i < n; i++){
            ArrayList<Integer> temp1 = new ArrayList<>(hmp1.get(i-1));
            temp1.add(A[i]);
            hmp1.put(i, temp1);
            ArrayList<Integer> temp2 = new ArrayList<>(hmp2.get(i-1));
            temp2.add(B[i]);
            hmp2.put(i, temp2);
        }
        int [] ans = new int[n];
        if(A[0]!=B[0]){
            ans[0] = 0;
        }else{
            ans[0] = 1;
        }
        for(int i = 1; i < n; i++){
            ArrayList<Integer> currentList1 = new ArrayList<>(hmp1.get(i));
            ArrayList<Integer> currentList2  = new ArrayList<>(hmp2.get(i));
            int count = 0;
            for(Integer number: currentList1){
                if(currentList2.contains(number)){
                    count++;
                }
            }
            ans[i] = count;
            
        }
        
        
        return ans; 
    }
}

     */
    
}
