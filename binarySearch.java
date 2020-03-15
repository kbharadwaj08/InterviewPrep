import java.util.Scanner;

public class binarySearch {

    public static void main(String[]  args)
    {

        int a[] = {2, 3, 4, 10, 40};
        int size = a.length;
        int key=24;

        binarySearch bs = new binarySearch();
        bs.bsearch(a,size,key);
    }

    public void bsearch(int a[],int s,int k)
    {
        int l=0,r=s-1;
        int flag =0;

        while(l <= r) {
            int mid = (l + r) / 2;

            if (a[mid] == k) {
                System.out.println(" Search Element " + k + " is found in the array at position " + mid);
                flag =1;
            }

            if (k < a[mid])
                r = mid -1;
            else
                l = mid +1;
        }
        if(flag==0)
        System.out.println("Search element not found");
    }


}
