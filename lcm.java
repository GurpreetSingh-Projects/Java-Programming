import java.util.*;

class lcm {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
        }
        int n1 = 2;
        int n2 = 3;
        System.out.print((n1 * n2) / hcf(n1, n2));
    }

    public static int hcf(int n1, int n2) {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }
}