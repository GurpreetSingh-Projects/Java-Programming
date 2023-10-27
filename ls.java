class ls {
    public static void main(String args[]) {

        int arr[]=new int[20];
        int num = 20;
        int s=5;
        for(int i=0;i<num;i++)
        {
            arr[i] = i;
        }
        for(int i=0;i<num;i++)
        {
            if(s==arr[i])
            {
                System.out.print("Found at " + (i ));
            }
        }

    }
}