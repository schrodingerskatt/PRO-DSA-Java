// Problem Link : https://leetcode.com/problems/first-completely-painted-row-or-column/

public class Leetcode_Session_37 {

/*
class Pair{
    int x;
    int y;
    public Pair(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getFirst(){
        return x;
    }
    public int getSecond(){
        return y;
    }

}
class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {

        int n_row = mat.length;
        int n_col = mat[0].length;
        int [] row = new int[n_row];
        int [] col = new int[n_col];

        HashMap<Integer,Pair>hmp= new HashMap<>();
        for(int i = 0; i < n_row; i++){
            for(int j = 0; j < n_col; j++){
                hmp.put(mat[i][j],new Pair(i,j));
            }
        }
        
        for(int i = 0; i < arr.length; i++){

            Pair p = hmp.get(arr[i]);
            int visit_row = p.getFirst();
            int visit_col = p.getSecond();
            row[visit_row]++;
            col[visit_col]++;
            if(row[visit_row] == n_col || col[visit_col]==n_row){
               return i;
               
            }

        }
    return -1;
        
    }
}  
*/
    
}
