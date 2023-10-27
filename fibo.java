class fibo
{
    public static void main(String args[])
    {
        int arr[] = new int[25];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<15;i++)
        {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for(int i=0;i<15;i++)
        {
            System.out.println(arr[i]);
        }
    }
}