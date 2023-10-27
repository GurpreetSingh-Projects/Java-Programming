import java.util.*;

class hcffinder {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
        }
        int n1 = 3;
        int n2 = 15;
        System.out.print(hcf(n1, n2));
    }

    public static int hcf(int n1, int n2) {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }
}