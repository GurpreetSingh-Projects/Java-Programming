class bs {
    public static void main(String args[]) {

        int arr[]=new int[20];
        int num = 20;
        int s=15;
        for(int i=0;i<num;i++)
        {
            arr[i] = i;
        }
        
        int left = 0, right = arr.length;
        while(left<right)
        {
            int mid=(left +right-1)/2;
            if(arr[mid]==s)
                System.out.println(mid);
            if (s > arr[mid]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }

        }

    }
}