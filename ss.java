public class ss {
    public static void main(String args[])
    {
        int arr[] = { 9, 8, 4, 3, 4, 5, 3, 2, 1, 4, 7, 6, 4, 53, 5, 345, 67, 8 };
        
        for (int i = 0; i < arr.length; i++)
        {
            int smallest = i;
            for(int j=i+1;j<arr.length-1;j++)
            {
                if (arr[smallest] > arr[j])
                    smallest = j;
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        
        
        
        
        
        
        
        
        
        
        
        
        for(int i=0;i<arr.length-1;i++)
         {
             System.out.println(arr[i]);
         }
    }
}
