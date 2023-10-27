// Java implementation of recursive Binary Search
class BinarySearch {

	// Returns index of x if it is present in arr[l..
	// r], else return -1
	
    int bs(int arr[],int l, int r, int x)
    {
        while (l < r)
        {
            int m = (l + r - 1) / 2;
            if(x==arr[m])
                return m;
            else if(x<arr[m])
                return bs(arr, l, m - 1, x);
            else
                return bs(arr, m + 1, r, x);

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
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println(
				"Element is not present in array");
		else
			System.out.println(
				"Element is present at index " + result);
	}
}
