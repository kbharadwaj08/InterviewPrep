public class insertionSort {

    public void insertionSort(int arr[])
    {
        int n = arr.length;
        insertionSort is = new insertionSort();
        for(int i=1;i<n;i++)
        {
            int key = arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
                is.printArray(arr);
            }
            arr[j+1]=key;
            is.printArray(arr);
        }
        is.printArray(arr);
    }

    public void printArray(int arr[])
    {
        int s=arr.length;
        System.out.print("{");
        for(int k=0;k <= s-1;k++)
            System.out.print(arr[k]+",");
        System.out.print("}");
        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = {2,4,5,1,6,3,9,7};
        System.out.println("The Input array, before sorting : ");
        insertionSort is = new insertionSort();
        is.printArray(arr);
        is.insertionSort(arr);
        System.out.println("Output array after insertion sort : ");
        is.printArray(arr);
    }
}
