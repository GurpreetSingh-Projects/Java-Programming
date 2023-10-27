import java.util.*;
public class printdigitsvertically {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int nums = sc.nextInt();
        String str = Integer.toString(nums);
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }
    }
}
