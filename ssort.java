public class ssort {
    public static void main(String args[])
    {
        int arr[] = { 9, 8,4,3,4,5,3,2,1,4, 7, 6, 4, 53, 5, 345, 67, 8 };
        for (int j = 0; j < arr.length; j++)
        for(int i=0;i<arr.length-1;i++)
        {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
         for(int i=0;i<arr.length-1;i++)
         {
             System.out.println(arr[i]);
         }
    }
}
