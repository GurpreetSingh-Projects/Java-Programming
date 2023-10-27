import java.util.*;

class fibonaccilastdigit {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            long fib[] = new long[n + 2];
            fib[0] = 0;
            fib[1] = 1;
            for (int a = 2; a <= n; a++) {
                fib[a] = fib[a - 1] + fib[a - 2];
                long temp = 1000;
                if (fib[a] > temp) {
                    fib[a] = fib[a] % temp;
                }
            }
            System.out.print(fib[n] % 10);
        }
    }
}