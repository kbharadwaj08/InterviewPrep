public class reverseArray {

    public static void main(String[] args)
    {
        int a[] = {21,42,19,3,61,11};
        System.out.print("Input Array: ");
        reverseArray.print(a);

        reverseArray.turnItAround(a);

        System.out.print("Reversed Array : ");
        reverseArray.print(a);


    }

    public static void turnItAround(int[] a) {
        int start =0, end=a.length-1;
        int temp;

        while(start < end)
        {
            temp = a[end];
            a[end]=a[start];
            a[start]=temp;

            start++;
            end--;
        }
    }

    public static void print(int[] a) {
        for(int i =0; i<=a.length-1;i++)
            System.out.print(a[i]+" ,");
        System.out.println();
    }
}
