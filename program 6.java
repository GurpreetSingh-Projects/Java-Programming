import java.util.Arrays;

class BinarySearch {

	// Returns index of x if it is present in arr[].
	int binarySearch(int arr[], int x)
	{
        int left=0, right=arr.length;
        while(left<right)
        {
            int mid=(left+right-1)/2;
            if(x==arr[mid])
            return mid;
            else if(arr[mid]<x)
            left = mid + 1;
            else
            right=mid-1;    
        }
        return -1;
	}
	// Driver code
	public static void main(String args[])
	{
		BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 67, 100, 6, 3, 4, 21, 4, 5, 345, 345, 34, 53, 453, 45, 345, 46, 7, 68, 6, 96, 10, 40 };
        Arrays.sort(arr);
		// for(int i=0;i<arr.length-1;i++)
        // {
        //     if(arr[i]<arr[i+1])
        //     {
        //         int temp = arr[i];
        //         arr[i] = arr[i + 1];
        //         arr[i + 1] = temp;
        //     }
        // }
        int x = 10;
		int result = ob.binarySearch(arr, x);
		if (result == -1)
			System.out.println(
				"Element is not present in array");
		else
			System.out.println("Element is present at "
							+ "index " + result);
	}
}
