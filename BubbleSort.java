public class BubbleSort {

    public void bubbleSortAlgo(int arr[])
    {
        int n= arr.length;
        for(int i=0; i<n-1;i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }

    public void printArray(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    public static void main(String[] Args)
    {
        int[] arr = {6,5,3,4,2,1,0};
        BubbleSort bs = new BubbleSort();
        bs.printArray(arr);
        bs.bubbleSortAlgo(arr);
        bs.printArray(arr);
    }
}
