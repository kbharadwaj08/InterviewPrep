public class findNthLargest {

    public static void main(String[] args)
    {
        int a[] = {44,3,23,75,15,26,7};
        int whichLargest = 4;
        System.out.println("Input Array: ");
        findNthLargest.print(a);
        System.out.println();

        findNthLargest.sort(a);
        System.out.println("sorted Array: ");
        findNthLargest.print(a);
        System.out.println();

        System.out.println("The "+whichLargest+" number in the given number is: "+a[a.length-whichLargest]);
    }

    private static void print(int[] a) {

        for(int i=0;i<=a.length-1;i++)
            System.out.print(a[i]+",");

    }

    public static void sort(int[] a) {

        int temp=0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j] > a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
