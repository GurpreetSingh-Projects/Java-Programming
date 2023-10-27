import java.util.*;
import java.util.Arrays;

class maxpairwiseproduct_fast {

    static long maxproduct(long arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 2] * arr[arr.length - 1];
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            for (int a = 0; a < n; a++) {
                arr[a] = sc.nextLong();
            }
            long result = maxproduct(arr);
            System.out.print(result);
        }
    }

}
