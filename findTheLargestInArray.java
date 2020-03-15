public class findTheLargestInArray {

    public static void main(String[] args)
    {
        int a[] = {33,14,25,55,76,98,22,11,100,20};
        int hnum=a[0];

        for(int i=0; i< a.length-1;i++)
            if(a[i+1] > a[i])
                hnum=a[i+1];

            System.out.println(hnum);
    }
}
