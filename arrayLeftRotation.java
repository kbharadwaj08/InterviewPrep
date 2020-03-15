public class arrayLeftRotation {

    public void leftRotation(int arr[], int rot)
    {
        for(int i=0;i<=rot;i++)
            leftRotateOne(arr);
    }

    public void leftRotateOne(int[] arr) {

        int temp=arr[0], len=arr.length,i;
        for(i=0;i<len-1;i++)
        {
            arr[i] = arr[i+1];
        }
        arr[i]=temp;
    }

    public void printArray(int arr[])
    {
        System.out.print("{");
        for(int i=0;i<arr.length-1;i++)
            System.out.print(arr[i]+",");
        System.out.print("}");
        System.out.println();
    }

    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int rotateBy = 4;
        arrayLeftRotation obj = new arrayLeftRotation();
        System.out.println("Before Rotation: ");
        obj.printArray(arr);

        obj.leftRotation(arr,rotateBy);

        System.out.println("After Rotation: ");
        obj.printArray(arr);
    }

}
