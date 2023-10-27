public class armstrong {
    public static void main(String args[]) {
        int n = 1633;
        int temp = n;
        int p = 0;
        String s = Integer.toString(n);
        int length = s.length();

        while (n > 0) {
            int rem = n % 10;
            p = p + ((int) Math.pow(rem, length));
            n = n / 10;
        }
        if (p == temp) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}

