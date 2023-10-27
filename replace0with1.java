import java.util.*;

class replace0with1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();

        String str = Integer.toString(num), str1 = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0')
                str1 += '1';
            else
                str1 += str.charAt(i);
        }
        
        replace0with1 obj = new replace0with1();
        obj.output(str1);
        
    }

    void output(String str)
    {
        System.out.print(str);
    }
}