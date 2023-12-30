import java.util.*;

public class Subarrays_with_XOR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        HashMap<Integer, Integer> hmp = new HashMap<>();
        int count = 0;
        hmp.put(0, 1);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum ^ arr[i];
            int xor = sum ^ k;
            if (hmp.containsKey(xor)) {
                count += hmp.get(xor);
            }
            hmp.put(sum, hmp.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);
    }
}
