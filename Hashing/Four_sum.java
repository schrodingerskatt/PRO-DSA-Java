import java.util.*;
public class Four_sum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        Arrays.sort(nums);
        List<List<Integer>>ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i]==nums[i-1]){
                continue;
            }
        for(int j = i+1; j < n; j++){
            if(j > i+1 && nums[j]==nums[j-1]){
                continue;
            }
        int k = j+1;
        int l = n-1;
        while(k < l){
            long sum = nums[i];
            sum+=nums[j];
            sum+=nums[k];
            sum+=nums[l];
        if(sum == target){
        List<Integer>temp = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
        ans.add(temp);
        k++;
        l--;
        while (k < l && nums[k]==nums[k-1]) k++;
        while (k < l && nums[l]==nums[l+1]) l--;
        }
        else if(sum < target){
            k++;
        }
        else{
            l--;
        }
        }
    }
     
}
   System.out.println(ans); 
    }
}
    

