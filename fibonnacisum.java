import java.util.*;

class fibonnacisum {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            long fib[] = new long[n + 2];
            fib[0] = 0;
            fib[1] = 1;
            long sum = 1;
            for (int a = 2; a <= n; a++) {
                fib[a] = fib[a - 1] + fib[a - 2];
                long temp = 10;
                if (fib[a] > temp) {
                    fib[a] = fib[a] % temp;
                }
                sum += fib[a] % 10;

            }
            System.out.println(sum % 10);
        }

    }
}