


import java.util.*;
public class Max_sum_digit {

    public static int sum_digit(int num){
        int sum = 0;
        while(num!=0){
            int d = num%10;
            sum+=d;
            num = num/10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, ArrayList<Integer>>hmp = new HashMap<>();
        for(int i = 0; i < n; i++){
            int num = sum_digit(arr[i]);
            ArrayList<Integer> temp = hmp.getOrDefault(num, new ArrayList<>());
            temp.add(arr[i]);
            hmp.put(num,temp);
        }
        int max_sum = -1;
        for(Map.Entry<Integer, ArrayList<Integer>>entry:hmp.entrySet()){
            ArrayList<Integer> values = entry.getValue();
            if(values.size()>1){
                int max_1 = Integer.MIN_VALUE;
                int pos_1 = -1;
                for(int i = 0; i < values.size();i++){
                    if(values.get(i)>max_1){
                        max_1 = values.get(i);
                        pos_1 = i;
                    }
                }
                int max_2 = Integer.MIN_VALUE;
                for(int i = 0; i < values.size(); i++){
                    if(i!=pos_1){
                        max_2 = Math.max(max_2,values.get(i));
                    }
                }            
            max_sum = Math.max(max_sum, max_1+max_2);
            }
        }
    System.out.println(max_sum);
    }
}
