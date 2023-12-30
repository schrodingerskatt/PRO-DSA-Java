import java.util.*;
public class Upperbound {

// Upper Bound (x) = Returns index of the number which is just greater 
//                    than x and as close as possible to x.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]=scn.nextInt();
        }
        int target = scn.nextInt();

        int low = 0, high = n;
        while(low < high){
            int mid = low+(high-low)/2;
            if(arr[mid]<=target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

    if(low > n){
        System.out.println("No Upper bound for target");
    }else{
        System.out.println("Upper bound found at target "+ low);
    }
}
    
}
