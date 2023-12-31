public class Sum_recursion {


    public static int recursion_call(int n){
        if(n==0){
            return 0;
        }
        return n+recursion_call(n-1);
    }
    public static void main(String[] args) {
        System.out.println(recursion_call(10));
    }
    
}
