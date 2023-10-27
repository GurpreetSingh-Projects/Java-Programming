import java.util.*;
class noof3s
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range to count till: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            String temp = Integer.toString(i);
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == '3') {
                    count++;
                }
            }
        }
        noof3s obj = new noof3s();
        obj.output(count);
    }

    void output(int count)
    {
        System.out.print("Count: " + count);
    }
}