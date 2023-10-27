import java.util.*;

class maxpairwiseproduct_slow {

    static long maxproduct(long arr[]) {
        long result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((long) (arr[i] * arr[j]) > result)
                    result = (long) arr[i] * arr[j];
            }
        }
        return result;
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
