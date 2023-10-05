import java.io.*;
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
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
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
